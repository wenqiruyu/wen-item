package com.server.eureka.wen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 微服务注册中心
 *
 * @param
 * @author yingx
 * @date 2020/3/19
 * @return
 */
@SpringBootApplication
@EnableEurekaServer // 添加Eureka服务器注解
public class WenEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WenEurekaServerApplication.class, args);
    }

}
