package io.cxh.spring.demo2;

/**
 * Spring的实例化Bean的三种方式
 * *1 无参数的构造方法实例化Bean
 * Created by Administrator on 2017/3/6.
 */
public class Bean1 {

    private String name;

    public Bean1() {
        System.out.println("Bean1实例化了。。。。");
    }

    public Bean1(String name) {
        this.name = name;
    }


}
