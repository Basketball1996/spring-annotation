package com.atguigu;

import com.atguigu.config.MainConfig;
import com.atguigu.pojo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
        for (String str : beanNamesForType) {
            System.out.println(str);
        }
        System.out.println("-------------------------------");
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String bean : beanDefinitionNames) {
            System.out.println(bean);
        }
    }
}
