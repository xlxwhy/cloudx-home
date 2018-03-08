package com.cloudx.feign.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.cloudx.feign.provider.service.HelloService;

@FeignClient(name="cloudx-feign-provider", fallback=FeignHelloServiceFallback.class)
public interface FeignHelloService extends HelloService{

}
