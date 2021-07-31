package com.microservices.camelmicroservicesb.beans.transformaers;

import com.microservices.camelmicroservicesb.beans.CurrencyExchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TransformCurrencyExchange {
    Logger log = LoggerFactory.getLogger(TransformCurrencyExchange.class);
    public CurrencyExchange process(CurrencyExchange currencyExchange) {
        log.info("Transforming Currency Exchange from {} to {}", currencyExchange.getFrom(), currencyExchange.getTo());
        log.info(currencyExchange.toString());

        // Transforming logic

        return  currencyExchange;
    }
}
