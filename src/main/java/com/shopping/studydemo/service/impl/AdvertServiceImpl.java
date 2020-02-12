package com.shopping.studydemo.service.impl;

import com.shopping.studydemo.dao.AdvertMapper;
import com.shopping.studydemo.entiy.Advert;
import com.shopping.studydemo.service.AdvertService;
import com.shopping.studydemo.util.CheckUtil;
import com.shopping.studydemo.util.UUIDUtil;
import com.shopping.studydemo.util.system.PageRange;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wqk0
 */
@Service
@Slf4j
public class AdvertServiceImpl implements AdvertService {
    @Autowired
    private AdvertMapper dao;

    @Override
    public List<Advert> getAll(String pageNum, String pageRow) {
        PageRange pageRange = new PageRange(pageNum, pageRow);
        return dao.getAll(Integer.toString(pageRange.getStart()),Integer.toString(pageRange.getEnd()));
    }

    @Override
    public List<Advert> getAdvertAppletsList() {
        return dao.getAdvertAppletsList();
    }

    @Override
    public int countGetAll() {
        return dao.countGetAll();
    }

    @Override
    public String addAdvert(Advert advert) {
        CheckUtil.notNull(advert,"添加的轮播图是空的");
        CheckUtil.notBlank(advert.getAdvertTitle(),"标题为空");
        CheckUtil.notBlank(advert.getAdvertImgUrl(),"图片地址为空");

        advert.setId(UUIDUtil.getUuid());
        advert.setIsDisable("0");
        dao.insert(advert);
        return advert.getId();
    }

    @Override
    public String editAdvert(Advert advert) {
        CheckUtil.notNull(advert,"添加的轮播图是空的");
        CheckUtil.notBlank(advert.getAdvertTitle(),"标题为空");
        CheckUtil.notBlank(advert.getAdvertImgUrl(),"图片地址为空");

        dao.editAdvert(advert);
        return advert.getId();
    }

    @Override
    public Boolean deleteAdvert(String id) {
        CheckUtil.notBlank(id,"id为空");
        dao.deleteByPrimaryKey(id);
        return true;
    }

    @Override
    public int sortAdvert(String sortTime) {
        CheckUtil.notBlank(sortTime,"当前轮播图排序时间为空");
        return dao.sortAdvert(sortTime);

    }
}
