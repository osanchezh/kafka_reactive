package com.buffer.consumer.listener;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consumeMsg(String msg) {
        System.out.println(format("Consuming the message from wikimedia-stream Topic:: %s", msg));
        // Please feel free to do anything you want with the data
    }
}