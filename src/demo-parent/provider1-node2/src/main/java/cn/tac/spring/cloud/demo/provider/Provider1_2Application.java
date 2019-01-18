package cn.tac.spring.cloud.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : tac
 * @date : 23/04/2017
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider1_2Application {
    public static void main(String[] args){
        SpringApplication.run(Provider1_2Application.class, args);
    }
}
