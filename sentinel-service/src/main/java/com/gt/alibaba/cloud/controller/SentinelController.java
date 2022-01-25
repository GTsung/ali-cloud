package com.gt.alibaba.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GTsung
 * @date 2022/1/25
 */
@RestController
public class SentinelController {



    @RequestMapping("/sentinel")
    // 流控，value為資源
    @SentinelResource(value = "sentinel", defaultFallback = "fallBack")
    public Object sentinel() {
        return "sentinel";
    }


    public Object fallBack(BlockException e) {
        return "broke";
    }
}
