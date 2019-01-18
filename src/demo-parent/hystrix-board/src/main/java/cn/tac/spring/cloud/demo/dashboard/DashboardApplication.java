package cn.tac.spring.cloud.demo.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author : tac
 * @date : 25/04/2017
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
public class DashboardApplication {
    public static void main(String[] args){
        SpringApplication.run(DashboardApplication.class, args);
    }
}
