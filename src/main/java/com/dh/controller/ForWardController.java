package com.dh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:D-hao
 * @Date:2020/9/29-09-29-21:48
 * @Description:com.dh.controller
 *
 *      请求转发
 *   特点如下：
 *          1.地址栏的请求不会发生变化，显示还是第一次的请求地址
 *          2.请求的次数，有且仅有一次
 *          3.请求域中的数据不会丢失
 *          4.根目录：localhost：8080/项目地址/，包含了项目的访问地址
 */
@Controller
public class ForWardController {
    /**
     * 在使用转发的时候掐灭需要添加forward： 前缀，同时通过写的字符串能够看到forward请求不经过视图处理器（写前后缀了）
     * 视图处理器：写在spring中的 bean 的 InternalResourceViewResolver
     * @return
     */
    @RequestMapping("/forward01")
    public String forWordTest() {
        System.out.println("forward01");
        return "forward:/index.jsp";
    }

    /**
     *  控制台内容：forward02  forward01
     *  就是先调用forward请求，再转到forward01中去
     *  实现请求直接的互相转发
     * @return
     */
    @RequestMapping("/forward02")
    public String forWordTest02() {
        System.out.println("forward02");
        return "forward:/forward01";
    }
}
