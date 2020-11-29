package com.example.jenkins_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {
    private static Logger logger= LoggerFactory.getLogger(JenkinsTestApplication.class);

    @Test
    void contextLoads() {
        logger.info("Test Executed !");
        Assertions.assertEquals(true,true);

    }

}
