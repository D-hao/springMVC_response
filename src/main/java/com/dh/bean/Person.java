package com.dh.bean;

import javafx.scene.chart.PieChart;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @Auther:D-hao
 * @Date:2020/10/1-10-01-20:36
 * @Description:com.dh.bean
 */

/**
 * 自定义日期转化 和 信息校验
 * 自定义日期转化：但是需要注意的是在配置日期格式化转换器时候，通过配置了类型转化器，那么此时日期转化器就会失效
 *              那么此时就需要：FormattingConversionServicefacryBean对象。
 *
 */
@Component
public class Person {
    @NotNull
    private  Integer id;
    @Length(min=5,max = 10)
    private  String name;
    private String password;
    //自定义日期转化
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Past
    private Date birth;
    @Email
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", birth=" + birth +
                ", email='" + email + '\'' +
                '}';
    }
}
