package com.me.zy;

import java.util.ArrayList;

/**
 * 测试类
 * 创建一个宠物店实例，给定余额，初始化动物列表，一个空的顾客列表测试买入动物，招待顾客，歇业
 */
public class Test {
    public static void main(String[] args) {

        //创建一个宠物店实例
        MyAnimalShop animalShop = new MyAnimalShop();

        animalShop.setMoney(500);
        animalShop.setAnimalList(new ArrayList<>());
        animalShop.setBusiness(true);
        animalShop.setCustomerList(new ArrayList<>());

        Animal dog = new Dog("狗狗",18,"公",true);

        animalShop.buyAnimal(dog);

        Customer customer = new Customer("张三");

        animalShop.hospitalityCustomer(customer);

        animalShop.stop();
    }
}
