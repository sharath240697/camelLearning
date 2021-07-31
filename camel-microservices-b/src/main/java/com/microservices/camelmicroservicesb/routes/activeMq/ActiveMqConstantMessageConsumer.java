package com.microservices.camelmicroservicesb.routes.activeMq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * The route subscribes to the activemq queue named "first-queue".
 * the input is expected to be string and will be stored in the file.
 *
 * The input json format must be as shown
 * {
 *   "id": 1000,
 *   "from": "USD",
 *   "to": "INR",
 *   "conversionMultiple": 70
 * }
 *
 * the route can be disabled or enable by commenting/uncommenting the @Component
 * annotation.
 */

@Component
public class ActiveMqConstantMessageConsumer extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:first-queue")
                .log("${body}")
                .to("file:learningFiles/activemq-messages");
    }
}
