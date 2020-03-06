package com.xs.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xs-shuai
 */
@RestController
public class TestController {
    @GetMapping("hello")
    public String hello() {
        return "hello spring security";
    }

    @GetMapping("/signout/success")
    public String signout() {
        return "退出成功，请重新登录";
    }
}
