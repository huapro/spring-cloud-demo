package cn.tac.spring.cloud.demo.client;

import cn.tac.spring.cloud.demo.api.Provider1DemoRemoteService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author : tac
 * @date : 23/04/2017
 */

//name 指定了 client 对应的微服务实例名
//path 指定了 client 远程调用时访问的 api controller mapping
//fallback 指定了 client 调用失败时进行降级处理所使用的类(必须实现 client 对应的接口类)
@FeignClient(name="provider1", path = "demo", fallback = Provider1DemoClient.HystrixClientFallback.class)
public interface Provider1DemoClient extends Provider1DemoRemoteService {
    //fallback 指定的类也必须注册为一个 spring bean
    @Component
    class HystrixClientFallback implements Provider1DemoClient {
        public String index() {
            return "request fall back";
        }
    }
}
