package com.example.jenkins_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsTestApplication {

    private static Logger logger= LoggerFactory.getLogger(SpringApplication.class);
    @PostConstruct
    public void intt(){
        logger.info("Application Started !");

    }

    public static void main(String[] args) {
        logger.info("Application Executed !");
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
