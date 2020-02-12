package com.shopping.studydemo.dao;

import com.shopping.studydemo.entiy.Advert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wqk
 */
public interface AdvertMapper {

    /**
     * 添加
     * @param advert
     * @return
     */
    int insert(Advert advert);

    List<Advert> getAll(
            @Param("pageNum") String pageNum,
            @Param("pageRow") String pageRow);

    List<Advert> getAdvertAppletsList();

    int countGetAll();

    int deleteByPrimaryKey(String id);

    int editAdvert(Advert advert);

    int sortAdvert(String sortTime);



}
