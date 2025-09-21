package com.kafka.kafkaproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicCreator {

        @Bean
        public NewTopic createNewTopic(){
            return  new NewTopic("user-topic", 5,(short) 1);
        }


}
