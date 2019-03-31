package com.hualin.mall.user.controller;

import com.hualin.mall.user.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wanghualin
 * @date : 2019-03-26 13:52
 **/
@RestController
public class HelloController {
    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        System.out.println(name);
        return helloRemote.hello(name + "!");
    }
}
