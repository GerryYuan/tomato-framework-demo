package com.tomato.framework.demo.server;

import com.tomato.framework.plugin.rmi.register.RmiRegister;
import com.tomato.framework.plugin.rmi.server.Rmi2Server;

public class Server2Application {
    
    public static void main(String[] args) throws Exception {
        RmiRegister register = new RmiRegister(HelloWorld.class.getSimpleName(), new HelloWorldImpl());
        new Rmi2Server(register).start();
    }
}
