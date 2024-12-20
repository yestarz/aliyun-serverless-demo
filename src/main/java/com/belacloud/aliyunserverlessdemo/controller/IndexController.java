package com.belacloud.aliyunserverlessdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class IndexController {

    @GetMapping("/test")
    public String test(@RequestParam("name") String name) {
        return "hello world!" + name;
    }

}
