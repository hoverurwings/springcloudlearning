package com.shanks.controller;

import com.shanks.entity.Student;
import com.shanks.feign.FeignProvideClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class Handler {
    @Autowired
    private FeignProvideClient feignProvideClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProvideClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProvideClient.index();
    }
}
