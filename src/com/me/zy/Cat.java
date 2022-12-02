package com.me.zy;

/**
 * 猫猫类
 */
public class Cat extends Animal{


    //默认猫猫是200元
    public Cat(String name, int age, String sex) {
        super(name, age, sex, 200);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                '}';
    }
}
