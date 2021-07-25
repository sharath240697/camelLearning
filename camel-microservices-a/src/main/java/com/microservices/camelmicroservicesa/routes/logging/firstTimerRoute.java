package com.microservices.camelmicroservicesa.routes.logging;

import com.microservices.camelmicroservicesa.beans.GetCurretTimeBean;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class firstTimerRoute extends RouteBuilder {

    @Autowired
    private GetCurretTimeBean getCurretTimeBean;

    @Override
    public void configure() throws Exception {
        from("timer:first-timer")
               // .transform().constant("Time is "+ LocalDateTime.now())
               .bean(getCurretTimeBean,"getCurrentTime")
                .to("log:first-timer");
    }
}
