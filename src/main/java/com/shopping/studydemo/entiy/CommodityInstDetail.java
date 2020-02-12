package com.shopping.studydemo.entiy;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import javax.validation.constraints.PositiveOrZero;
@Data
public class CommodityInstDetail {
    /**
     * 商品id
     */
    @Length(max = 64)
    private String commodityInstId;

    /**
     * 商品现价
     */
    private Double commodityInstPrice;

    /**
     * 货品id
     */
    @Length(max = 64)
    private String commodityId;

    /**
     * 库存
     */
    private Integer commodityStock;

    /**
     * 销量
     */
    private Integer salesCount;

    /**
     * 单位
     */
    @Length(max = 8)
    private String unit;

    /**
     * 状态
     */
    private String state;

    /**
     * 商品原价
     */
    private Double commodityOriginalPrice;

    /**
     * 商品折扣
     */
    private Double discount;

    /**
     * 库存警告线
     */
    private Integer stockWarningQuantity;

    /**
     * 限购
     */
    @PositiveOrZero(message = "限购数要大于或等于0")
    @Digits(integer = 5, fraction = 0, message = "超过最大限购数")
    private Integer maxBuy;

    /**
     * 是否删除
     */
    private Boolean isDisable;
}
