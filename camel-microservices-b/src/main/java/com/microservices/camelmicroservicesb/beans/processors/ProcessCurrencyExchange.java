package com.microservices.camelmicroservicesb.beans.processors;

import com.microservices.camelmicroservicesb.beans.CurrencyExchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProcessCurrencyExchange {
    Logger log = LoggerFactory.getLogger(ProcessCurrencyExchange.class);
    public CurrencyExchange process(CurrencyExchange currencyExchange) {
        log.info("Processing Currency Exchange from {} to {}", currencyExchange.getFrom(), currencyExchange.getTo());

        // Processing logic

        return  currencyExchange;
    }
}
