package com.shopping.studydemo.service;


import com.shopping.studydemo.dao.test;
import com.shopping.studydemo.entiy.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private test testDao;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}
