package com.xbhog.lotterygateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xbhog
 */
@EnableEurekaClient
@SpringBootApplication
public class LotteryGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryGateWayApplication.class, args);
    }

}
