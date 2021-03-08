package com.kafka.consumer.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TopicConsumer {


    @KafkaListener(topics = "t_hello",groupId = "hello3")
    public void consume(ConsumerRecord<String,String> message) {

        log.info("Message arrived {}", message.value());
    }
}
