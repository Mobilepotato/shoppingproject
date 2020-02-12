package com.shopping.studydemo.entiy;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
@Data
public class StoreCommodityCategory {
    /**
     * 编号
     */
    @Length(max = 64)
    private String categoryId;

    /**
     * 类别名称
     */
    @Length(max = 64)
    private String categoryName;

    /**
     * 父类别id
     */
    @Length(max = 64)
    private String parentCategoryId;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 是否删除
     */
    private String isDisable;

    /**
     * 创建人
     */
    @Length(max = 64)
    private String creator;

    /**
     * 排序时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sortTime;

    /**
     * 是否显示导航栏
     */
    private String isNavbar;

    /**
     * 图片路径
     */
    @Length(max = 255)
    private String imgUrl;
}
