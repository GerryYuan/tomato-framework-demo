package com.tomato.framework.demo.server;

public class HelloWorldImpl implements HelloWorld {
    
    @Override
    public String hello(String hello) {
        System.out.println("服务端接收数据："+hello);
        return hello;
    }
}
