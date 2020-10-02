package com.dh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:D-hao
 * @Date:2020/9/29-09-29-22:02
 * @Description:com.dh.controller
 *
 * 重定向：浏览器进行页面的跳转，需要发送两次请求（第一次人为的，第二次自动的）
 * 特点：
 *  1.地址栏发生变化，显示最新发送的请求地址
 *  2.请求次数，两次或者多次
 *  3.请求域中的数据会丢失，因为是不同的请求
 *  4.根目录：localhost：8080/ 不包含项目名称
 */
@Controller
public class RedirectController {
    /**
     * 用法和forward一样
     * 使用重定向的时候需要注意，添加redirect：前缀
     * 也不经过是视图处理器
     * @return
     */
    @RequestMapping("/redirect01")
    public String redirectTest01() {
        System.out.println("redirect01");
        return "redirect:/index.jsp";
    }
    @RequestMapping("/redirect02")
    public String redirectTest02() {
        System.out.println("redirect02");
        return "redirect:/redirect01";
    }
}
