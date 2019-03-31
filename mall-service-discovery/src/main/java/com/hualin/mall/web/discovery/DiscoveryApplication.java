package com.hualin.mall.web.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务发现启动入口
 *
 * @author : wanghualin
 * @date : 2019-03-24 23:57
 **/
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplication {
    public static void main(String[] args) {

        SpringApplication.run(DiscoveryApplication.class, args);
    }
}
