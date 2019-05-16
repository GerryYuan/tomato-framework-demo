package com.tomato.framework.demo;

import com.tomato.framework.demo.server.HelloWorldImpl;
import com.tomato.framework.plugin.rmi.server.RMIServer;
import com.tomato.framework.plugin.rmi.server.RMIServerImpl;

public class ServerApplication {
    
    public static void main(String[] args) {
        RMIServer rmiServer = new RMIServerImpl();
        rmiServer.publish(new HelloWorldImpl(), 7000);
        System.out.println("server发布成功");
    }
}
