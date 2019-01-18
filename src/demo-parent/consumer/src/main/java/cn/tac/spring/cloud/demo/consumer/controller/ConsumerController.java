package cn.tac.spring.cloud.demo.consumer.controller;

import cn.tac.spring.cloud.demo.client.Provider1DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : tac
 * @date : 23/04/2017
 */

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    /**
     * 这里 ide 会提示 bean not find (去掉 suppress warnings 注解)是因为
     * @FeignClient 声明的接口并没有直接的实现类，其具体的实现类 bean 是在
     * 应用启动的时候才由 feign 生成并注册的到 spring 容器中的，所以 ide 检测
     * 不到，但并不影响程序正确执行
     */
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private Provider1DemoClient client;

    @RequestMapping("/p1/demo/index")
    public String p1index(){
        return client.index();
    }
}
