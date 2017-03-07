package io.cxh.spring.demo4;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的完整的生命周期测试
 * Created by Administrator on 2017/3/6.
 */
public class SpringDemo4 {

    @Test
    public void demo1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        ProductDaoImpl productDao = (ProductDaoImpl)applicationContext.getBean("productDao");
        productDao.save();
        productDao.update();
        applicationContext.close();
    }
}
