package com.feign.consumer.service;

public interface FeignService{

   
    public String helloService(String name);

   
    public String helloService(String name,String password);  

}