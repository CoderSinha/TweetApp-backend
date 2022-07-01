package com.tweetapp.TweetApp.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Configuration
public class KafkaProducerConfig {
//    public static final String TOPIC_NAME = "message";
//    @Autowired
//    private KafkaTemplate<String, Object> kafkaTemplate;
//
//    public void sendMessage(String message) {
//        log.info(String.format("Message sent-> %s", message));
//        this.kafkaTemplate.send(TOPIC_NAME, TOPIC_NAME, message);
//    }
//
//    @Bean
//    public NewTopic createTopic() {
//        return new NewTopic(TOPIC_NAME, 3, (short) 1);
//    }
}
