package com.shopping.studydemo.entiy;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
@Data
public class Store {
    /**
     * 编号
     */
    @Length(max = 64)
    private String storeId;

    /**
     * 门店名称
     */
    @Length(max = 32)
    private String storeName;

    /**
     * 经度
     */
    private Double storeLatitude;

    /**
     * 纬度
     */
    private Double storeLongitude;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 门店地址
     */
    @Length(max = 150)
    private String storeAddress;

    /**
     * 门店管理员id
     */
    @Length(max = 64)
    private String storeAdmin;

    /**
     * 管理员姓名
     */
    private String adminName;

    /**
     * 管理员手机
     */
    @Length(max = 11)
    private String adminPhone;

    /**
     * 门店账号
     */
    @Length(max = 64)
    private String storeLoginname;

    /**
     * 门店密码
     */
    @Length(max = 64)
    private String storePassword;

    /**
     * 创建人
     */
    @Length(max = 64)
    private String creator;

    /**
     * 门店联系电话
     */
    @Length(max = 11)
    private String phone;

    /**
     * 门店状态
     */
    private String state;

    /**
     * 是否删除
     */
    private Boolean isDisable;
}
