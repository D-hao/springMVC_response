package com.dh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:D-hao
 * @Date:2020/9/29-09-29-23:36
 * @Description:com.dh.controller
 *
 * 静态资源的访问:详解看mvc.xml
 */
@Controller
public class StaticController {
    /**
     * 静态资源的访问，需要再springmvc.xml中设置mvc的两个注解
     *   此时发现路劲没问题，但是找不到静态资源（图片）？
     *      大家发现此时找不到对应的mapping映射的，是因为DispatcherServlet会拦截所有请求，此时没有对应图的请求处理方法
     *   报错，需要添加配置<mvc:default-servlet-handler>
     *       <mvc:default-servlet-handler>：表示我们自己配置的请求controller来处理，但是不能请求的处理交tomcat来处理，
     *       静态资源可以访问，但是动态资源不能
     *    再添加 <mvc:annotation-driven>
     *         <mvc:annotation-driven>:保证静态和动态都可以访问
     *
     * @return
     */
    @RequestMapping("/static")
    public String staticTest() {
        System.out.println("static");
        return "forward:/index.jsp";
    }
}
