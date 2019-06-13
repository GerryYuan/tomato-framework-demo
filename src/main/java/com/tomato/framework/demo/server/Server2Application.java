package com.tomato.framework.demo.server;

import com.tomato.framework.plugin.rmi.register.RmiRegister;
import com.tomato.framework.plugin.rmi.server.Rmi2Server;

public class Server2Application {
    
    public static void main(String[] args) throws Exception {
        RmiRegister register = new RmiRegister(HelloWorld.class.getSimpleName(), new HelloWorldImpl());
        Rmi2Server rmi2Server = new Rmi2Server(register);
        rmi2Server.start();
        rmi2Server.stop();
    }
}
