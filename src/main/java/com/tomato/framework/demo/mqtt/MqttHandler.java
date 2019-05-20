package com.tomato.framework.demo.mqtt;

import com.tomato.framework.plugin.mqtt.invoke.AbstractMqttInvoke;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MqttHandler extends AbstractMqttInvoke {
    
    @Override
    public void invoke(String msg) {
        log.info("消息接收" + msg);
    }
    
    @Override
    public String[] listenTopics() {
        return new String[]{"topic"};
    }
}
