package com.dh.viewResolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

/**
 * @Auther:D-hao
 * @Date:2020/10/1-10-01-18:00
 * @Description:com.dh.viewResolver
 */

/**
 * 自定义视图管理器所需要返回的对象
 */
@Component
public class MyView implements View {
    /**
     * 设置类型
     * @return
     */
    public String getContentType() {
        return "text/html";
    }

    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("map" + map);
        httpServletResponse.setContentType("text/html");
        PrintWriter writer = httpServletResponse.getWriter();
        writer.write("<h1>welcome to DH 页面</h1>");
    }
}
