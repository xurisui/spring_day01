package io.cxh.spring.demo5;

/**
 * Created by Administrator on 2017/3/7.
 */
public class Car {
    private String name;
    private Double price;

    public Car() {}

    public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
