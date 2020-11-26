package com.zdp.springbootquickstart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sesshomaru
 * @date 2020/11/26
 */
@RestController
public class Controller {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/hello")
    public String hello() {
        return "hello jenkins, my is " + port;
    }
}

