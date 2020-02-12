package com.shopping.studydemo.entiy;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import javax.validation.constraints.PositiveOrZero;
@Data
public class Other {
    /**
     * id
     */
    @Length(max = 64)
    private String id;

    /**
     * 自动收货时间
     */
    private Integer autoRreceivingGoods;

    /**
     * 首页商品推荐数
     */
    private Integer recommendNum;

    /**
     * 催单回复设置
     */
    @Length(max = 255)
    private String reminderReply;

    /**
     * 搜索附近时的公里数
     */
    private Double kilometre;

    /**
     * 客服电话
     */
    @Length(max = 11)
    private String waiterPhone;

    /**
     * 满减额度
     */
    @PositiveOrZero(message = "额度错误")
    @Digits(integer = 4, fraction = 2, message = "超出最大额度")
    private Double fullReduction;

    /**
     * 关于我们
     */
    private String aboutUs;

    /**
     * 产品介绍
     */
    private String aboutProduct;
}
