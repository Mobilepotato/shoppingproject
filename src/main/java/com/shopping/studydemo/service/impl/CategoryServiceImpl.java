package com.shopping.studydemo.service.impl;

import com.shopping.studydemo.dao.CategoryMapper;
import com.shopping.studydemo.entiy.StoreCommodityCategory;
import com.shopping.studydemo.service.CategoryService;
import com.shopping.studydemo.util.CheckUtil;
import com.shopping.studydemo.util.UUIDUtil;
import com.shopping.studydemo.util.system.PageRange;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wqk
 */
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper dao;

    @Override
    public List<StoreCommodityCategory> getAll(String pageNum, String pageRow) {
        PageRange pageRange = new PageRange(pageNum, pageRow);
        return dao.getAll(Integer.toString(pageRange.getStart()),Integer.toString(pageRange.getEnd()));
    }

    @Override
    public int countGetAll() {
            return dao.countGetAll();
    }

    @Override
    public String addCategory(StoreCommodityCategory category) {
        CheckUtil.notNull(category,"添加的类目是空的");
        CheckUtil.notBlank(category.getCategoryName(),"类目名为空");
        CheckUtil.notBlank(category.getImgUrl(),"图片地址为空");

        category.setCategoryId(UUIDUtil.getUuid());
        category.setIsDisable("0");
        dao.insert(category);
        return category.getCategoryId();
    }

    @Override
    public String editCategory(StoreCommodityCategory category) {
        CheckUtil.notNull(category,"添加的轮播图是空的");
        CheckUtil.notBlank(category.getCategoryName(),"类目名为空");
        CheckUtil.notBlank(category.getImgUrl(),"图片地址为空");

        dao.editAdvert(category);
        return category.getCategoryId();
    }

    @Override
    public Boolean deleteCategory(String category_id) {
        CheckUtil.notBlank(category_id,"id为空");
        dao.deleteByPrimaryKey(category_id);
        return true;
    }

    @Override
    public List<StoreCommodityCategory> loadCategoryById(String category_id) {
        CheckUtil.notBlank(category_id,"id为空");
        return dao.selectByPrimaryKey(category_id);
    }

    @Override
    public int sortCategory(String sortTime) {
        CheckUtil.notBlank(sortTime,"当前轮播图排序时间为空");
        return dao.sortCategory(sortTime);
    }
}
