package cn.tac.spring.cloud.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author : tac
 * @date : 26/04/2017
 */

@SpringBootApplication
//该注解标识当前应用将作为 zuul 网关启动
//该注解默认会将网关作为一个服务注册到注册中心，所以不需要再声明@EnableDiscoveryClient
@EnableZuulProxy
public class GatewayApplication {
    public static void main(String[] args){
        SpringApplication.run(GatewayApplication.class, args);
    }
}
