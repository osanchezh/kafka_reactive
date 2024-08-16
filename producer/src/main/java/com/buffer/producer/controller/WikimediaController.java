package com.buffer.producer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buffer.producer.stream.WikimediaStreamConsumer;

@RestController
@RequestMapping("/api/v1/wikimedia")
public class WikimediaController {

	@Autowired
    private WikimediaStreamConsumer streamConsumer;

    @GetMapping
    public void startPublishing() {
        streamConsumer.consumeStreamAndPublish();
    }
}