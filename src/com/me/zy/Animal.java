package com.me.zy;

/**
 * 动物抽象类
 */
public abstract class Animal {

    //动物名
    protected String name;

    //年龄
    protected int age;

    //性别
    protected String sex;

    //价格
    protected  double price;

    @Override
    public abstract String toString();

    public Animal(String name, int age, String sex, double price) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }
}
