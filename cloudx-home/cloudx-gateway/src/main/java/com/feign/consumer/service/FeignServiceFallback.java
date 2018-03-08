package com.feign.consumer.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallback implements FeignService{

	@Override
	public String helloService(String name) {
		return "get error";
	}

	@Override
	public String helloService(String name,String password) {
		return "head error";
	}


}