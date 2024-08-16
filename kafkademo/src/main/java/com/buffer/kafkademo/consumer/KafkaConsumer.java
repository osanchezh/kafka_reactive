package com.buffer.kafkademo.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.buffer.kafkademo.payload.Student;

import static java.lang.String.format;

@Service
public class KafkaConsumer {

   // @KafkaListener(topics = "alibou", groupId = "myGroup")
    public void consumeMsg(String msg) {
        System.out.println(format("Consuming the message from alibou Topic:: %s", msg));
    }

    @KafkaListener(topics = "alibou", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
    	System.out.println(format("Consuming the message from alibou Topic:: %s", student.toString()));
    }
}