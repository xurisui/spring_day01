package io.cxh.spring.demo4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Bean的完整的生命周期的是一个步骤
 * Created by Administrator on 2017/3/6.
 */
public class ProductDaoImpl implements ProductDao, BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String name;

    public void setName(String name) {

        this.name = name;
        System.out.println("第二步：属性注入：" + name);
    }

    public ProductDaoImpl() {
        System.out.println("第一步：实例化Bean");
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("第三步：获得Bean的名称" + beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步：让bean了解Spring的工厂");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性设置完成。。。。");
    }

    public void setup() {
        System.out.println("第七步：执行手动配置的初始化方法。。。。");
    }

    public void save() {
        System.out.println("第九步：执行业务的save方法");
    }

    public void update() {
        System.out.println("第九步：执行业务的update方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步：执行Spring中提供的对象销毁方法。。。");
    }

    public void tearDown() {
        System.out.println("第十一步：执行手动配置的销毁方法");
    }
}
