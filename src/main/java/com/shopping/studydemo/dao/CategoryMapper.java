package com.shopping.studydemo.dao;

import com.shopping.studydemo.entiy.Advert;
import com.shopping.studydemo.entiy.StoreCommodityCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {

    int insert(StoreCommodityCategory storeCommodityCategory);

    List<StoreCommodityCategory> getAll(
            @Param("pageNum") String pageNum,
            @Param("pageRow") String pageRow);
    int countGetAll();

    int deleteByPrimaryKey(String category_id);

    int editAdvert(StoreCommodityCategory storeCommodityCategory);

    List<StoreCommodityCategory> selectByPrimaryKey(String category_id);

    int sortCategory(String sortTime);
}
