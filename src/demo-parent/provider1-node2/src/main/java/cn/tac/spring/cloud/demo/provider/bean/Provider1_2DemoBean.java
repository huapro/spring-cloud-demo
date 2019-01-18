package cn.tac.spring.cloud.demo.provider.bean;

import org.springframework.stereotype.Component;

/**
 * @author : tac
 * @date : 23/04/2017
 */

@Component
public class Provider1_2DemoBean {
    public String greeting(){
        return "hello world from provider1-2";
    }
}
