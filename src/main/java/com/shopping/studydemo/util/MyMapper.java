package com.shopping.studydemo.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

/**
 * @author ASUS
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    /**
     * 无参获取全部的方法
     * @return
     */
    @Override
    List<T> selectAll();



}
