Please export your environment before starting the stack:

Ref taken : https://github.com/conduktor/kafka-stack-docker-compose

export DOCKER_HOST_IP=127.0.0.1

Run with:

#docker-compose -f docker-compose.yml up

stop docker images

#docker-compose -f docker-compose.yml down

Then run springboot application

#mvn springboot:run

For windows cmd use following command OR you can run app in IDE

#mvn org.springframework.boot:spring-boot-maven-plugin:run

Open postman

Request URL: (Method should be POST only)
http://localhost:8080/kafka/publish?message=new message is here


download apache maven from here
https://maven.apache.org/download.cgi

