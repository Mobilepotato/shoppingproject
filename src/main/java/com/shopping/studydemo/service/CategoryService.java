package com.shopping.studydemo.service;


import com.shopping.studydemo.entiy.StoreCommodityCategory;

import java.util.List;

public interface CategoryService {
    List<StoreCommodityCategory> getAll(String pageNum, String pageRow);

    int countGetAll();

    String addCategory(StoreCommodityCategory storeCommodityCategory);

    String editCategory(StoreCommodityCategory storeCommodityCategory);

    Boolean deleteCategory(String category_id);

    List<StoreCommodityCategory> loadCategoryById(String category_id);

    int sortCategory(String sortTime);

}
