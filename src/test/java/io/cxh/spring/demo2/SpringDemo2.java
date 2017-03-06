package io.cxh.spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 实例化Bean的三种方法
 * Created by Administrator on 2017/3/6.
 */
public class SpringDemo2 {
    @Test
    //方法一：无参构造方式：
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");
        System.out.println(bean1);
    }

    @Test
    //方法二：静态工厂实例化方式：
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
        System.out.println(bean2);
    }

    @Test
    //方法三：实例工厂实例化方式：
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
        System.out.println(bean3);
    }
}
