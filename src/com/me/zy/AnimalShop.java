package com.me.zy;

/**
 * 宠物店接口
 */
public interface AnimalShop {

    //买入新动物(需要的参数自己决定)
    void buyAnimal(Animal animal);

    //招待客户(Customer)
    void hospitalityCustomer(Customer customer);

    //歇业()
    void stop();
}
