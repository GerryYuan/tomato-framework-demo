package com.tomato.framework.demo.client;

import com.tomato.framework.demo.dto.PostDemo;
import com.tomato.framework.demo.service.HelloWorld;
import com.tomato.framework.plugin.rmi.discovery.Discovery;
import com.tomato.framework.plugin.rmi.discovery.RmiDiscovery;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author Created by gerry
 * @version 1.0
 * @date 2019-06-13-22:40
 */
public class Client {
    
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Discovery discovery = new RmiDiscovery();
        HelloWorld helloWorld = discovery.getBean(HelloWorld.class.getSimpleName());
        System.out.println(helloWorld.hello("hello gerry!"));
        PostDemo postDemo = new PostDemo();
        postDemo.setName("gerry");
        System.out.println(helloWorld.post(postDemo));
    }
}
