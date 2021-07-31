package com.microservices.camelmicroservicesa.routes.moveFiles;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * The route moves the files placed in <project-root-dir>/files/input to
 * to aproject-root-dir>/files/output.
 *
 * the route can be disabled or enable by commenting/uncommenting the @Component
 * annotation.
 */

// @Component
public class FileRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:learningFiles/input")
                .log("${body}")
                .to("file:learningFiles/output");
    }
}
