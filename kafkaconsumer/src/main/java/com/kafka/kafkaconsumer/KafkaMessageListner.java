package com.kafka.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListner {

    private static final Logger log = LoggerFactory.getLogger(KafkaMessageListner.class);

    @KafkaListener(topics = "user-topic", groupId = "jt-group")
    public void consume(String message){
        log.info("Consumer Consume the message {}" ,message);
    }
}
