package com.adouer.config;

import com.adouer.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.adouer.pojo")
@Import(MyAnnotaionConfig2.class)
public class MyAnnotaionConfig {

    //@Bean相当于bean标签
    //方法名称相当于bean标签id属性
    //方法返回类型相当于bean标签的class
    @Bean
    public User user () {
        return new User();
    }
}
