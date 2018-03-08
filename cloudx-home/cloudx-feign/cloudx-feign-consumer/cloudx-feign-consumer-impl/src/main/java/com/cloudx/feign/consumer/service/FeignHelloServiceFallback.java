package com.cloudx.feign.consumer.service;

import org.springframework.stereotype.Component;

import com.cloudx.feign.provider.entity.User;

@Component
public class FeignHelloServiceFallback implements FeignHelloService{

	@Override
	public String hello(String name) {
		return "get error";
	}

	@Override
	public String hello(String name,String password) {
		return "head error";
	}
	
	@Override
	public String hello(User userDemo) {
		return "post error";
	}

}
