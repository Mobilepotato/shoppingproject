package com.shopping.studydemo.dao;


import com.shopping.studydemo.entiy.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface test {

    TestEntity getById(Integer id);

}
