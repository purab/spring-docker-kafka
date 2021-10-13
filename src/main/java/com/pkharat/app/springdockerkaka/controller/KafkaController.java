package com.pkharat.app.springdockerkaka.controller;

import com.pkharat.app.springdockerkaka.service.ProducerClass;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    private final ProducerClass producer;

    public KafkaController(ProducerClass producer) {
        this.producer = producer;
    }


    @PostMapping(value = "/publish")
    public String sendMessage(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
        return "published succesfuly";
    }

    @Bean
    public NewTopic adviseTopic() {
        return new NewTopic("user",3, (short) 1);
    }
}
