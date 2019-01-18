package cn.tac.spring.cloud.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : tac
 * @date : 23/04/2017
 */

@SpringBootApplication
@EnableDiscoveryClient
//该注解标识当前应用启动时将会扫描 @FeignClient 声明的 interface ，为其生成实现并注册到 spring 容器中
//basePackages指定要扫描的包名，将在这些 packages 中扫描 @FeignClient 注解标识的 interface，不指定将默认扫描当前类所在的包
//注意: @FeignClient 注解是无法通过 spring 提供的 @ComponentScan 进行扫描注册的，必须通过此注解
@EnableFeignClients(basePackages = "cn.tac.spring.cloud.demo.client")
//该注解标识将开启熔断服务
@EnableCircuitBreaker
//因为 spring boot 默认扫描当前 app 所在的包，所以这里需要手动指定包，以注册到 client 的 fallback 处理类
@ComponentScan("cn.tac.spring.cloud.demo")
public class ConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
