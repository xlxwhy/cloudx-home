package com.cloudx.feign.provider.entity;

public class User {
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public User() {
        super();
    }
    
    private String name;
    
    private String password;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "name: " + name + " password: " + password;
    }
}
