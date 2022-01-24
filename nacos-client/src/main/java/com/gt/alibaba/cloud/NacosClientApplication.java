package com.gt.alibaba.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author GTsung
 * @date 2022/1/24
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(NacosClientApplication.class, args);
        while (true) {
            String fuck = run.getEnvironment().getProperty("fuck.who");
            System.err.println("================= " + fuck);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
