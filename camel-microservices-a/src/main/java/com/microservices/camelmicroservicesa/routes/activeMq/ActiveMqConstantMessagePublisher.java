package com.microservices.camelmicroservicesa.routes.activeMq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * The route publishes the string "my message for activeMq"
 * to activemq queue named "first-queue" every 10 seconds.
 *
 * the route can be disabled or enable by commenting/uncommenting the @Component
 * annotation.
 */

// @Component
public class ActiveMqConstantMessagePublisher extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:active-mq-timer?period=10000")
                .transform().constant("my message for activeMq")
                .log("${body}")
                .to("activemq:first-queue");
    }
}

