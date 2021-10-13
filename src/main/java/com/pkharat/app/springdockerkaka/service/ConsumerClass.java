package com.pkharat.app.springdockerkaka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsumerClass {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerClass.class);

    @KafkaListener(topics = "user")
    public void consume(String message) {
        logger.info(String.format("################# Consumer consuming message:-> %s",message));
    }


}
