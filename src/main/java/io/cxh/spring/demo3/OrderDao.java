package io.cxh.spring.demo3;

/**
 * Created by Administrator on 2017/3/6.
 */
public class OrderDao {

    public void setUp() {

        System.out.println("Bean的初始化方法执行了、、、");
    }

    public void save() {
        System.out.println("save方法执行了、、、");

    }

    public void tearDown() {
        System.out.println("Bean的销毁方法执行了、、、、");

    }
}
