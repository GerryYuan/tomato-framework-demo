package com.tomato.framework.demo;

import com.tomato.framework.core.main.Starter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Starter.run(DemoApplication.class, args);
    }

}
