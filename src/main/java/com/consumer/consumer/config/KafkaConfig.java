package com.consumer.consumer.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.consumer.consumer.config.Constants.KAFKA_GROUP_NAME;
import static com.consumer.consumer.config.Constants.KAFKA_TOPIC_NAME;

@Configuration
public class KafkaConfig {

    private final Logger log = LoggerFactory.getLogger(KafkaConfig.class);

    @KafkaListener(topics = KAFKA_TOPIC_NAME, groupId = KAFKA_GROUP_NAME)
    public void receivedMessage(String message) {
        log.info(message);

    }

}
