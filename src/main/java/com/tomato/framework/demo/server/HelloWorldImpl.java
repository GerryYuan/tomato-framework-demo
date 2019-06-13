package com.tomato.framework.demo.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorld {
    
    public HelloWorldImpl() throws RemoteException {
        super();
    }
    
    @Override
    public String hello(String hello) throws RemoteException {
        System.out.println("服务端接收数据："+hello);
        return hello;
    }
}
