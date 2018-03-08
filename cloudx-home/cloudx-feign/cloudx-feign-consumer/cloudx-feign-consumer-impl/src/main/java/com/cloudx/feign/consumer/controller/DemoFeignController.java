package com.cloudx.feign.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloudx.feign.consumer.service.FeignHelloService;
import com.cloudx.feign.provider.entity.User;

@RestController
public class DemoFeignController {
	
	@Autowired
	private FeignHelloService helloService;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String demoServiceTest() {
		StringBuffer sb = new StringBuffer();
		sb.append(helloService.hello("yuanyuan"));
		sb.append("<br>");
		sb.append(helloService.hello("yjt","xixihaha"));
		sb.append("<br>");
		sb.append(helloService.hello(new User("yejingtao","123456")));
		return sb.toString();
	}
}
