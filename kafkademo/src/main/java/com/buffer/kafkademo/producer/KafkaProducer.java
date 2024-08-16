package com.buffer.kafkademo.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
public class KafkaProducer {

	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        System.out.println(format("Sending message to alibou Topic:: %s", msg));
        kafkaTemplate.send("alibou", msg);
    }
}