package com.xs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: learn_root
 * @description: 配置中心客户端
 * @author: xs-shuai.com
 * @create: 2020-05-24 00:20
 **/
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class ConfigClient7000 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient7000.class,args);
    }
}
