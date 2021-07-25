package com.microservices.camelmicroservicesa.beans;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class GetCurretTimeBean {
    public String getCurrentTime() {
        return String.format("The time of the execution is %s", LocalDateTime.now());
    }
}
