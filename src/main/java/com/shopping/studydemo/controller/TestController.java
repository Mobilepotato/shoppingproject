package com.shopping.studydemo.controller;



import com.shopping.studydemo.entiy.TestEntity;
import com.shopping.studydemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demoproject/test")
public class TestController {

    @Autowired
    private TestService testService ;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public TestEntity test(Integer id){
        System.out.println("id:" + id);
        return testService.getById(id);
    }
}
