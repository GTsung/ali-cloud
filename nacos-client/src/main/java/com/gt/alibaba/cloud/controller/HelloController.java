package com.gt.alibaba.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GTsung
 * @date 2022/1/24
 */
@RefreshScope
@RestController
public class HelloController {

    @Value("${fuck.who}")
    private String fuckValue;

    @RequestMapping(value = "/fuck")
    public Object fuck(){
        return "fuck " + fuckValue;
    }
}
