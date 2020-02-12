package com.shopping.studydemo.entiy;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import java.util.Date;
@Data
public class CustomerOrder {
    /**
     * 订单编号
     */
    @Length(max = 64)
    private String orderId;

    /**
     * 商城用户id
     */
    @Length(max = 64)
    private String customerId;

    /**
     * 收货地址id
     */
    private Integer customerAddressId;

    /**
     * 实际应付金额
     */
    @Digits(integer = 18, fraction = 2)
    private Double payment;

    /**
     * 付款类型
     */
    @Length(max = 20)
    private String paymentType;

    /**
     * 快递费用
     */
    @Digits(integer = 18, fraction = 2)
    private Double postage;

    /**
     * 订单状态
     */
    @Length(max = 20)
    private String state;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;

    /**
     * 交易结束时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     * 交易关闭时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date closeTime;

    /**
     * 交易支付时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date paymentTime;

    /**
     * 发货时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sendTime;

    /**
     * 自提门店id(0为配送，其他为门店id)
     */
    @Length(max = 64)
    private String storeId;

    /**
     * 是否删除
     */
    private Boolean isDisable;

    /**
     * 收货地址
     */
    @Length(max = 128)
    private String address;

    /**
     * 收货人
     */
    @Length(max = 64)
    private String consignee;

    /**
     * 收货人电话
     */
    @Length(max = 11)
    private String consigneePhone;
}
