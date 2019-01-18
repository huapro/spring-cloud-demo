package cn.tac.spring.cloud.demo.provider.controller;

import cn.tac.spring.cloud.demo.api.Provider1DemoRemoteService;
import cn.tac.spring.cloud.demo.provider.bean.Provider1_2DemoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : tac
 * @date : 23/04/2017
 */

@RestController
@RequestMapping("demo")
public class Provider1_2DemoController implements Provider1DemoRemoteService {
    @Autowired
    private Provider1_2DemoBean bean;

    public String index(){
        return bean.greeting();
    }
}
