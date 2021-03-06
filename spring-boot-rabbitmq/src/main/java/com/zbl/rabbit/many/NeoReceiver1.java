package com.zbl.rabbit.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "zbl")
public class NeoReceiver1 {

    @RabbitHandler
    public void process(String zbl) {
        System.out.println("Receiver 1: " + zbl);
    }

}
