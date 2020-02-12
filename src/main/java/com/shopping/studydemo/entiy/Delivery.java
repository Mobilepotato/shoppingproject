package com.shopping.studydemo.entiy;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import java.math.BigDecimal;
@Data
public class Delivery {
    /**
     * 主键
     */
    @Length(max = 64)
    private String id;

    /**
     * 区域
     */
    @Length(max = 64, message = "区域信息过长！")
    private String region;

    /**
     * 满减运费额度
     */
    @Digits(integer = 4, fraction = 2, message = "额度超过范围")
    private BigDecimal discount;

    /**
     *
     */
    @Digits(integer = 4, fraction = 2, message = "运费超过范围")
    private BigDecimal freight;

    /**
     * 是否启用
     */
    private String state;

    /**
     * 是否删除
     */
    private Boolean isDisable;
}
