package cn.tac.spring.cloud.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : tac
 * @date : 23/04/2017
 */

@SpringBootApplication
//该注解标识应用启动后将作为一个微服务注册到注册中心
@EnableDiscoveryClient
public class Provider1_1Application {
    public static void main(String[] args){
        SpringApplication.run(Provider1_1Application.class, args);
    }
}
