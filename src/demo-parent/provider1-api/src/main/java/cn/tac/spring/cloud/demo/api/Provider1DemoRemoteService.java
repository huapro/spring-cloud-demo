package cn.tac.spring.cloud.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : tac
 * @date : 23/04/2017
 */

//通过该 interface 来确保 provider 的 controller 与 client 一致
//@RequestMapping("demo") //不能这样声明 controller mapping(使用 @FeignClient 解析时会报错)
public interface Provider1DemoRemoteService {
    //建议将 action mapping 写在此 interface 声明的方法，client 与 controller 均能继承
    @RequestMapping("index")
    String index();
}
