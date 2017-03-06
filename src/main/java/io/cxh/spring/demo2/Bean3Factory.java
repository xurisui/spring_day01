package io.cxh.spring.demo2;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Bean3Factory {
    public Bean3 getBean3Instance() {
        System.out.println("Bean3Factory执行了、、、、");
        return new Bean3();
    }
}
