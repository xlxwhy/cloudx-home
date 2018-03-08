package com.cloudx.feign.provider.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cloudx.feign.provider.entity.User;

public interface HelloService {
	
	@RequestMapping(value="/feign-service/get",method=RequestMethod.GET)
	String hello(@RequestParam("name") String name);
	
	@RequestMapping(value="/feign-service/header", method=RequestMethod.HEAD)
	String hello(@RequestHeader("name") String name, @RequestHeader("password") String password);
	
	@RequestMapping(value="/feign-service/post", method=RequestMethod.POST)
	String hello(@RequestBody User user);
	
	

}
