package com.dh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Auther:D-hao
 * @Date:2020/9/29-09-29-19:58
 * @Description:com.dh.controller
 *
 * 在向页面回显数据（把java中的数据返回页面），改变数据放置的域
 */

/**
 * 注意：sessionAttributes如果没有匹配到对应的名字，会报异常
 *
 * 结论：在使用@modelAttribute时候
 *  如果参数注解没有写名字，默认使用参数名字首字母小写匹配
 *  推荐使用参数进行匹配
 */
@Controller
@SessionAttributes(value = "msg",types = Integer.class)
public class OutputController {
    /**
     * 在向页面回显数据的时候，可以在方法的参数中显示的声明
     * map：
     * modelMAp:
     * model;
     * ModelAndView;
     * (以上四种都放在request域中)
     *
     * 都可以进行回显，回显后数据是保存在哪个作用域中？
     * page：当前页面
     * request：当前请求
     * session： 当前会话
     * application：当前应用(不常用)
     */
    @RequestMapping("/output")
    public String output01(Map<String, String> map) {
        map.put("msg", "hello springmvc");
        System.out.println(map.getClass());
        return "success";
    }
    @RequestMapping("/output2")
    public String output02(Model model) {
        model.addAttribute("msg","spring mvc");
        System.out.println(model.getClass());
        return "success";
    }
    @RequestMapping("/output3")
    public String output03(ModelMap modelMap) {
        modelMap.addAttribute("msg","spring mvc");
        System.out.println(modelMap.getClass());
        return "success";
    }

    /**
     * map,modelMAp,model三个对象的本质是一样的都是BindingAwareModelMap（继承了map,modelMAp,model）
     * 最后把BindingAwareModelMap装进ModelAndView对象中教给dispachterservlet
     * @return
     */
    @RequestMapping("/output4")
    public ModelAndView output03() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("msg","springmvc");
        return mv;
    }

    /**
     * 有时候根据需求需要把数据放到session域中
     * 借助注解： @SessionAttributes(value={"msg","demo1","demo02"})
     *          里面可以接受数组
     *          需要写在类上，并且标明数据变量名
     *          重点：此注解便是，每次在向request作用中设置属性值的时候，顺带向session保存一份
     *  value和type都写上表示session中可以保存名字为value值的参数以及Integer的参数（type会把所有符合类型的都放进去，尽量别用）
     * @param model
     * @return
     */
    @RequestMapping("/output5")
    public String testSession(Model model) {
        model.addAttribute("msg", "springmvc");
        return "success";
    }
}
