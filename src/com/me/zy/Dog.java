package com.me.zy;

/**
 * 中华田园犬类
 */
public class Dog extends Animal{

    //是否注射狂犬病疫苗
    private Boolean isVaccineInjected;

    //价格一百元
    public Dog(String name, int age, String sex, Boolean isVaccineInjected) {
        super(name, age, sex, 100);
        this.isVaccineInjected = isVaccineInjected;
    }

    public Dog(String name, int age, String sex, double price) {
        super(name, age, sex, price);
    }

    public Boolean getVaccineInjected() {
        return isVaccineInjected;
    }

    public void setVaccineInjected(Boolean vaccineInjected) {
        isVaccineInjected = vaccineInjected;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                ", isVaccineInjected=" + isVaccineInjected +
                '}';
    }
}
