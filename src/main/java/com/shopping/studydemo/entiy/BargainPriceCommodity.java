package com.shopping.studydemo.entiy;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import javax.validation.constraints.PositiveOrZero;
import java.util.Date;
@Data
public class BargainPriceCommodity {
    /**
     * 编号
     */
    @Length(max = 64)
    private String id;

    /**
     * 商品id
     */
    @Length(max = 64)
    private String commodityInstId;

    /**
     * 特价价格
     */
    private Double bargainPrice;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 结束时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     * 库存
     */
    private Integer bargainStock;

    /**
     * 创建人
     */
    @Length(max = 64)
    private String creator;

    /**
     * 状态
     */
    @Length(max = 8)
    private String state;

    /**
     * 图片
     */
    @Length(max = 256)
    private String garbainImages;

    /**
     * 销量
     */
    private Integer salesCount;

    /**
     * 排序时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sortTime;

    /**
     * 付款人数
     */
    private Integer paymentCount;

    /**
     * 限购
     */
    @PositiveOrZero(message = "限购数要大于或等于0")
    @Digits(integer = 5, fraction = 0, message = "超过最大限购数")
    private Integer maxBuy;
}
