package com.me.zy;

/**
 * 兔子类
 */
public class Rabbit extends Animal{

    private String color;

    public Rabbit(String name, int age, String sex, double price, String color) {
        super(name, age, sex, 50);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
