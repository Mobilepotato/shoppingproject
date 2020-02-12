package com.shopping.studydemo.controller;

import com.shopping.studydemo.entiy.StoreCommodityCategory;
import com.shopping.studydemo.service.CategoryService;
import com.shopping.studydemo.util.IResult;
import com.shopping.studydemo.util.PageResultBean;
import com.shopping.studydemo.util.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@Slf4j
@RequestMapping("/Category")
public class CategoryController {

    @Autowired
    private CategoryService impl;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public IResult getAll(String pageNum, String pageRow){
        return new PageResultBean<Collection<StoreCommodityCategory>>(impl.getAll(pageNum,pageRow),impl.countGetAll());
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public IResult addCategory(@RequestBody StoreCommodityCategory storeCommodityCategory){
        return new ResultBean<>(impl.addCategory(storeCommodityCategory));
    }
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public IResult editCategory(@RequestBody StoreCommodityCategory storeCommodityCategory){
        return new ResultBean<>(impl.editCategory(storeCommodityCategory));
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public IResult deleteCategory(String categoryId){
        return new ResultBean<>(impl.deleteCategory(categoryId));
    }

    @RequestMapping(value = "/loadCategoryById",method = RequestMethod.GET)
    public IResult loadCategory(String categoryId){
        return new ResultBean<>(impl.loadCategoryById(categoryId));
    }

    @RequestMapping(value = "/sort",method = RequestMethod.POST)
    public IResult sortCategory(String sortTime){
        return new ResultBean<>(impl.sortCategory(sortTime));
    }


}
