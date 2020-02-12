package com.shopping.studydemo.service;

import com.shopping.studydemo.entiy.Advert;

import java.util.List;

/**
 *  @author wqk
 *  @Date 创建时间：2020-1-20
 *  @description 测评打分服务层
 */
public interface AdvertService {

    List<Advert> getAll(String pageNum,String pageRow);

    List<Advert> getAdvertAppletsList();

    int countGetAll();

    String addAdvert(Advert advert);

    String editAdvert(Advert advert);

    Boolean deleteAdvert(String id);

    int sortAdvert(String sortTime);



}
