package com.me.zy;

import com.me.zy.exception.AnimalNotFoundException;
import com.me.zy.exception.InsufficientBalanceException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 我自己的第一家宠物店
 */
public class MyAnimalShop implements AnimalShop{

    //店的余额
    private double money;

    //一个存放动物的列表 (使用ArrayList、LinkedList或其他你喜欢的List实现)
    private List<Animal> animalList;


    //一个顾客列表留作纪念
    private List<Customer> customerList;

    //是否正在营业
    private Boolean isBusiness;

    @Override
    public void buyAnimal(Animal animal) {

        System.out.println("准备买入一只动物");

        this.money -= animal.price;

        if (this.money < 0){
            throw new InsufficientBalanceException("买动物余额不足");
        }

        animalList.add(animal);
        System.out.println("买入一只动物："+animal.name+"  成功!");
    }

    @Override
    public void hospitalityCustomer(Customer customer) {
        System.out.println("有顾客来啦");
        customerList.add(customer);
        customer.setCount(customer.getCount()+1);
        customer.setTime(LocalDate.now());

        if (animalList.size() <= 0){
            throw new AnimalNotFoundException("店内没有动物");
        }

        Animal animal = animalList.get(animalList.size() - 1);
        System.out.println(animal.toString());

        //动物转手一卖，小赚二十块钱。
        this.money += animal.price + 20;

        animalList.remove(animalList.size() - 1);
    }

    @Override
    public void stop() {
        System.out.println("店铺关门啦");

        this.isBusiness = false;

        //采用流，过滤出今日顾客
        List<Customer> collect = customerList.stream().filter(customer -> customer.getTime().equals(LocalDate.now())).collect(Collectors.toList());

        collect.stream().forEach(System.out::println);

        System.out.println("今日共盈利：" + collect.size() * 20 + "元");

    }


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public Boolean getBusiness() {
        return isBusiness;
    }

    public void setBusiness(Boolean business) {
        isBusiness = business;
    }
}
