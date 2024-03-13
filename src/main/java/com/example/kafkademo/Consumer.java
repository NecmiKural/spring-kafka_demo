package com.example.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
// or listener
public class Consumer {

    @KafkaListener(topics = "appTopic", groupId = "group1")
    public void listenMessage(String message) {
        System.out.println("Consumed message: " + message);
    }
}
