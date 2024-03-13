package com.example.kafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    @Autowired
    KafkaTemplate<String, String> template;

    public void sendMessage(String message) {
        // we can check the callbacks from send properties like success, failure, etc.
        template.send("appTopic", message);
    }
}
