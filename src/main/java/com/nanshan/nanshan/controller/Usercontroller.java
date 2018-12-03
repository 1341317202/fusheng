package com.nanshan.nanshan.controller;

import com.nanshan.nanshan.beans.User;
import com.nanshan.nanshan.service.Uservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
@ComponentScan(basePackages={"com.nanshan.nanshan.service"})//添加的注解
public class Usercontroller {

    @Autowired
    private Uservice uservice;

   @RequestMapping("/user")
    public Map<String,Object> get(){

        Map<String,Object> map=new HashMap<>(10);

     List<User> list= uservice.get();
     map.put("list",list);

        return map;
    }

}
