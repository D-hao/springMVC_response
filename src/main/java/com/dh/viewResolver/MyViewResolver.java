package com.dh.viewResolver;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @Auther:D-hao
 * @Date:2020/10/1-10-01-17:32
 * @Description:com.dh.viewResolver
 */

/**
 * 自定义视图管理器
 */
@Component
@Order(1)
public class MyViewResolver implements ViewResolver  {
    /**
     *  视图处理器就是实现了viewResolver,
     *  这个最主要的方法是实现resolveViewName其返回值是 View，
     *  再创建以类实现View接口
     * @param viewName
     * @param locale
     * @return
     * @throws Exception
     */
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        if (viewName.startsWith("dh:")) {
            System.out.println(viewName);
            return new MyView();
        } else {
            return  null;
        }
    }


    public int getOrder() {
        return 0;
    }
}
