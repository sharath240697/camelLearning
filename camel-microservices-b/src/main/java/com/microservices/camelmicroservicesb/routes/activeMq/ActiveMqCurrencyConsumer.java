package com.microservices.camelmicroservicesb.routes.activeMq;

import com.microservices.camelmicroservicesb.beans.CurrencyExchange;
import com.microservices.camelmicroservicesb.beans.processors.ProcessCurrencyExchange;
import com.microservices.camelmicroservicesb.beans.transformaers.TransformCurrencyExchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The route subscribes to the activemq queue named "currencyExchange-queue".
 * And converts currency json to currency beans
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
public class ActiveMqCurrencyConsumer extends RouteBuilder {

    @Autowired
    ProcessCurrencyExchange processCurrencyExchange;

    @Autowired
    TransformCurrencyExchange transformCurrencyExchange;


    @Override
    public void configure() throws Exception {
        from("activemq:currencyExchange-queue")
                .unmarshal().json(JsonLibrary.Jackson, CurrencyExchange.class)
                .bean("processCurrencyExchange")
                .bean("transformCurrencyExchange");


    }
}
