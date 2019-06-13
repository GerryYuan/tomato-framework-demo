package com.tomato.framework.demo.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloWorld extends Remote {
    
    String hello(String hello) throws RemoteException;
    
}
