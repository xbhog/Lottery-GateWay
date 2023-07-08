package com.xbhog.lotterygateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xbhog
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LotteryGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryGateWayApplication.class, args);
    }

}
