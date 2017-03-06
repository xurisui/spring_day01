package io.cxh.spring.demo2;

/**
 * Bean2的静态工厂
 * Created by Administrator on 2017/3/6.
 */
public class Bean2Factory {
    public static Bean2 getBean2Instance() {
        return new Bean2();
    }
}
