package com.example.kafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    @Autowired
    KafkaTemplate<String, String> template;

    @Value(value = "${kafka.topic}")
    private String topic;

    public void sendMessage(String message) {
        // we can check the callbacks from send properties like success, failure, etc.
        template.send(topic, message);
    }
}
