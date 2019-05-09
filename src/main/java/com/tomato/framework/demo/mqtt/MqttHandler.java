package com.tomato.framework.demo.mqtt;

import com.tomato.framework.plugin.mqtt.invoke.AbstractMqttInvoke;
import com.tomato.framework.plugin.mqtt.invoke.MqttInvokePlugin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MqttHandler extends AbstractMqttInvoke {
    
    @Override
    public void invoke(String msg) {
        log.info("消息接收"+msg);
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
        MqttInvokePlugin.getInstance().store(new String[]{"topic1"}, this);
    }
}
