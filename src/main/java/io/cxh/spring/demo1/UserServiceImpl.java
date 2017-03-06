package io.cxh.spring.demo1;

/**
 * Created by Administrator on 2017/3/6.
 */
public class UserServiceImpl implements UserService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello,Spring..." + name);
    }

}
