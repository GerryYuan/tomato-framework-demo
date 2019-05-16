package com.tomato.framework.demo;

import com.tomato.framework.demo.server.HelloWorld;
import com.tomato.framework.plugin.rmi.proxy.ProxyClient;

public class ClentApplication {
    
    public static void main(String[] args) {
        HelloWorld helloWorld = (HelloWorld) ProxyClient.createProxy(HelloWorld.class, "localhost", 7000);
        System.out.println("客戶端收到返回：" + helloWorld.hello("hello world"));
    }
}
