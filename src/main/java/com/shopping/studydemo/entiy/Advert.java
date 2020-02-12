package com.shopping.studydemo.entiy;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Data
public class Advert {

/**
 * 编号
 */
    @Length(max = 64)
    private String id;

    /**
     * 轮播图标题
     */
    @Length(max = 64)
    private String advertTitle;

    /**
     * 轮播图图片路径
     */
    @Length(max = 128)
    private String advertImgUrl;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 排序时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sortTime;

    /**
     * 是否删除
     */
    private String isDisable;

    /**
     * 小程序跳转路径参数
     */
    @Length(max = 256)
    private String advertUrl;
}
