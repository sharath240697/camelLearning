package com.microservices.camelmicroservicesa.routes.activeMq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * The route publishes the files placed in <project-root-dir>/files/activeMq-Input
 * to activemq queue named "currency-queue".
 *
 * The input file format must be as shown
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
public class ActiveMqCurrencyPublisher extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:learningFiles/activeMq-Input/currency")
                .log("${body}")
                .to("activemq:currencyExchange-queue");
    }
}

