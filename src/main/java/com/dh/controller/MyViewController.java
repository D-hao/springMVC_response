package com.dh.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:D-hao
 * @Date:2020/10/1-10-01-18:07
 * @Description:com.dh.controller
 */
//@Component
    @Controller
public class MyViewController {
    @RequestMapping("/view")
    public String forWordTest() {
        System.out.println("forward01");
        return "dh:/index.jsp";
    }
}
