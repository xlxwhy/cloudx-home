package com.cloudx.feign.provider.service;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloudx.feign.provider.entity.User;
import com.cloudx.feign.provider.service.HelloService;

@RestController
public class HelloServiceImpl implements HelloService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Override
    public String hello(@RequestParam("name") String name) {
        sleep("get");
        return "HelloServiceImpl name :" + name;
    }
    
    @Override
    public String hello(@RequestHeader("name") String name, @RequestHeader("password") String password) {
        sleep("header");
        return "helloServiceHead name :" + name + " password:" + password;
    }
    
    @Override
    public String hello(@RequestBody User userDemo) {
        sleep("post");
        return userDemo.toString();
    }
    
    private void sleep(String methodName) {
        int sleepMinTime = new Random().nextInt(3000);
        logger.info("helloService " + methodName + " sleepMinTime: " + sleepMinTime);
        //        try {
        //            //Thread.sleep(sleepMinTime);
        //        } catch (InterruptedException e) {
        //            e.printStackTrace();
        //        }
    }
}
