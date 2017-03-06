package io.cxh.spring.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/3/6.
 */
public class SpringDemo3 {

    @Test
    //Bean的作用范围
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        OrderDao orderDao1 = (OrderDao) applicationContext.getBean("orderDao");
        OrderDao orderDao2 = (OrderDao) applicationContext.getBean("orderDao");

        System.out.println(orderDao1);
        System.out.println(orderDao2);

    }

    @Test
    //Bean的生命周期
    //init-method:初始化的时候执行的方法    自动的
    //destory-method:销毁的时候执行的方法   手动销毁
    //   Bean生成必须是单例的，在工厂关闭的时候销毁，不是单例就不知道该关闭哪个了
    public void demo2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        OrderDao orderDao = (OrderDao)applicationContext.getBean("orderDao");
        orderDao.save();
        applicationContext.close();
    }
}
