package com.shopping.studydemo.controller;

import com.shopping.studydemo.entiy.Advert;
import com.shopping.studydemo.service.AdvertService;
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
@RequestMapping("/advert")
public class AdvertController {
    @Autowired
    private AdvertService impl;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public IResult getAdvertList(String pageNum, String pageRow){

        return new PageResultBean<Collection<Advert>>(impl.getAll(pageNum,pageRow),impl.countGetAll());
    }

    @RequestMapping(value = "/appletsList",method = RequestMethod.GET)
    public IResult getAdvertAppletsList(){

        return new PageResultBean<Collection<Advert>>(impl.getAdvertAppletsList(),impl.countGetAll());
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public IResult addAdvert(@RequestBody Advert advert){
        return new ResultBean<>(impl.addAdvert(advert));
    }
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public IResult editAdvert(@RequestBody Advert advert){
        return new ResultBean<>(impl.editAdvert(advert));
    }
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public IResult deleteAdvert(String id){
        return new ResultBean<>(impl.deleteAdvert(id));
    }

    @RequestMapping(value = "/sort",method = RequestMethod.POST)
    public IResult sortAdvert(String sortTime){
        return new ResultBean<>(impl.sortAdvert(sortTime));
    }


}
