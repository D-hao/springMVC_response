package com.dh.controller;

import com.dh.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther:D-hao
 * @Date:2020/10/1-10-01-21:14
 * @Description:com.dh.controller
 */

/**
 * 遗留问题：信息检验失败
 */
@Controller
public class ValidationPersonController {
    /**
     * bindingResult:绑定结果
     *
     * @param person
     * @param model
     * @param bindingResult
     * @return
     */
    @RequestMapping("/person")
    public String valladPerson(@Valid Person person, Model model, BindingResult bindingResult) {
        System.out.println(person);
        System.out.println("==============");
        Map<String, Object> map = new HashMap<String, Object>();
//        if (bindingResult.hasErrors()) {
//            System.out.println("------------------------------------=========================");
//            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
//            for (FieldError f : fieldErrors) {
//                System.out.println(f.getField());
//                System.out.println(f.getDefaultMessage());
//                map.put(f.getField(), f.getRejectedValue());
//            }
//            model.addAttribute("errors", map);
//            System.out.println("登录失败");
//            return "forward:/register .jsp";
//        } else {
//            System.out.println("登录成功");
//            return "forward:/index.jsp";
//        }
        return "forward:/index.jsp";
    }
}
