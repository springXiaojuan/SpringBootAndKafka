package com.jtv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

@Component
public class Sender {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String  message) {

//        this.template.sendDefault("test", msg);
//        System.out.println("发送消息：" + msg);
        ListenableFuture future = kafkaTemplate.send("test_boot", message);
        future.addCallback(o -> System.out.println("send-消息发送成功：" + message), throwable -> System.out.println("消息发送失败：" + message));
   
    }
}

