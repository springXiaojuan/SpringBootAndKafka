package com.jtv;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @KafkaListener(topics = { "test" })
    public void receiveMessage(ConsumerRecord<String, String> record) {
        System.out.println("接收消息");
        System.out.println("【*** 接收消息 ***】key = " + record.key() + "、value = " + record.value());
    }
}
