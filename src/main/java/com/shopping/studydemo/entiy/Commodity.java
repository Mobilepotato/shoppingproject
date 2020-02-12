package com.shopping.studydemo.entiy;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
@Data
public class Commodity {
    /**
     * 编号
     */
    @Length(max = 64)
    private String commodityId;

    /**
     * 货品名称
     */
    @Length(max = 32)
    private String commodityName;

    /**
     * 货品类别id
     */
    @Length(max = 64)
    private String commodityCategoryId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除
     */
    private Boolean isDisable;

    /**
     * 货品状态
     */
    private String state;

    /**
     * 创建人
     */
    @Length(max = 64)
    private String creator;

    /**
     * 货品图片
     */
    @Length(max = 2000)
    private String commodityImages;

    /**
     * 货品详细信息
     */
    @Length(max = 2000)
    private String commodityDescription;

    /**
     * 货品品牌
     */
    @Length(max = 64)
    private String commodityBand;

    /**
     * 关联id
     */
    @Length(max = 64)
    private String id;
}
