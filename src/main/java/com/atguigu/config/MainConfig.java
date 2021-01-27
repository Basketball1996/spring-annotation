package com.atguigu.config;

import com.atguigu.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration

//value指定要扫描的包
//excludeFilters = Filter  指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter  指定扫描的时候按照什么规则扫描那些组件,配合uesDefaultFilters = false使用
@ComponentScan(value = "com.atguigu",
               includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})},
               useDefaultFilters = false)
public class MainConfig {

    //@Bean  给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
    @Bean("personBean")
    public Person person(){
        return new Person("小明",20);
    }
}
