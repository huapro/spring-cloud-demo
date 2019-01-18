package cn.tac.spring.cloud.demo.provider.controller;

import cn.tac.spring.cloud.demo.api.Provider1DemoRemoteService;
import cn.tac.spring.cloud.demo.provider.bean.Provider1DemoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : tac
 * @date : 23/04/2017
 */

@RestController
//这里的 controller mapping 要跟 feign clinet 指定的 path 一致
@RequestMapping("demo")
public class Provider1DemoController implements Provider1DemoRemoteService {
    @Autowired
    private Provider1DemoBean bean;

    public String index(){
        return bean.greeting();
    }
}
