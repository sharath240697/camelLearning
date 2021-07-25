package com.microservices.camelmicroservicesa.routes.activeMq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class ActiveMqPublisher extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:active-mq-timer?period=10000")
                .transform().constant("my message for activeMq")
                .log("${body}")
                .to("activemq:first-queue");
    }
}

