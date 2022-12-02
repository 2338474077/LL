package com.me.zy;

import java.time.LocalDate;

/**
 * 顾客类
 */
public class Customer {

    //顾客名字
    private String name;

    //到店次数
    private int count;

    //顾客最近到店时间
    private LocalDate time;

    public Customer(String name, int count, LocalDate time) {
        this.name = name;
        this.count = count;
        this.time = time;
    }

    public Customer(String name) {
        this.name = name;
        this.count = 0;
        this.time = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "顾客：" + name + '\'' +
                ", 共到店" + count +
                "次, 最近一次是" + time;
    }
}
