package io.cxh.spring.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Administrator on 2017/3/6.
 */
public class SpringDemo1 {
    @Test
    //传统方式开发：
    public void demo1() {
//        UserService userService = new UserServiceImpl();

        UserServiceImpl userService = new UserServiceImpl();
        //手动设置
        userService.setName("老王");

        userService.sayHello();
    }

    @Test
    //Spring框架方式开发：读取类路径文件
    public void demo2() {
        //使用Spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //通过工厂获得类
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.sayHello();
    }

    @Test
    //Spring框架方式开发：读取本地文件
    public void demo3() {
        //使用Spring工厂
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\applicationContext.xml");
        //通过工厂获得类
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.sayHello();
    }

    @Test
    //BeanFactory的使用:给方法已经取消
    public void demo4() {
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathXmlApplicationContext("/src/applicationContext.xml"));
    }
}
