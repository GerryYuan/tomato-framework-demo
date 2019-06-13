package com.tomato.framework.demo.service;

import com.tomato.framework.demo.dto.PostDemo;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloWorld extends Remote {
    
    String hello(String hello) throws RemoteException;
    
    PostDemo post(PostDemo postDemo) throws RemoteException;
}
