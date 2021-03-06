package com.xs.controller;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xs.service.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: learn_root
 * @description:
 * @author: xs-shuai.com
 * @create: 2020-05-24 00:31
 **/
@RestController
public class InfoController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ProviderFeign providerFeign;


//    @Value("${neo.hello}")
    private String hello;


    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }


    @RequestMapping("/getport")
//    @HystrixCommand(fallbackMethod = "ribbonHelloFallback")
    public String get(){
        // 使用 Eureka + Ribbon 后，uri 填写服务名称即可
//        throw  new ArithmeticException();

        return providerFeign.getPortInfo();
    }

    public String ribbonHelloFallback() {
        return "Hello, this is fallback";
    }
}
