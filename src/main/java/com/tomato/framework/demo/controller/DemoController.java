package com.tomato.framework.demo.controller;

import com.tomato.framework.demo.dto.PostDemo;
import com.tomato.framework.plugin.mqtt.gateway.MqttGateway;
import com.tomato.framework.rest.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/framework/demo")
public class DemoController {
    
    @GetMapping("/getDemo")
    public Result<?> getDemo(@RequestParam String name) {
        return Result.ok(name);
    }
    
    @PostMapping("/postDemo")
    public Result<?> postDemo(@RequestBody PostDemo postDemo) {
        return Result.ok(postDemo);
    }
    
    @Autowired
    private MqttGateway mqttGateway;
    
    @GetMapping("/mqttDemo")
    public Result<?> mqttDemo(@RequestParam String msg) {
        mqttGateway.sendToMqtt("topic1",msg);
        return Result.ok(msg);
    }
    
}
