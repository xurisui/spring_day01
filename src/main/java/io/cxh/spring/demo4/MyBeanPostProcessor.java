package io.cxh.spring.demo4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/3/6.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步：执行初始化前执行的方法。。。");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第八步：执行初始化后执行的方法。。。。");

        //使用动态代理：

        if (beanName.endsWith("Dao")) {
            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                    if ("save".equals(method.getName())) {
                        System.out.println("===========权限校验");
                        return method.invoke(bean, args);
                    }
                    return method.invoke(bean, args);
                }
            });
            return proxy;
        }
        return bean;
    }
}
