# Camel Learning

The project is intended to learn java micro-services integration patterns and best practices. The Camel Integration framework is used to achieve the purpose.

## Steps to run the project
- Clone the project
- `cd ~/camel-microservices-<name>`
- `./gradlew clean build`
- `./gradlew bootRun`

Repeat the steps for each micro-services to start all the services.

## Pre-requisites
- Docker must be installed
- ActiveMq should be running
   * to run activeMq container, 
     run docker command `docker run --name activeMq -d -p 61616:61616 -p 8161:8161 rmohr/activemq`
