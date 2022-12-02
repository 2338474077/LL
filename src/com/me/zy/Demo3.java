package com.me.zy;

/**
 * 第三题 设计两个方法
 * 设计一个接收两个int数组的方法void, 使用多线程交替输出其中的元素
 * 如接收 arr1 = {1, 3, 5, 7, 9}, arr2 = {2, 4, 6, 8, 10}, 则输出 1 2 3 4 5 6 7 8 9 10
 * 设计一个接收邮箱String的方法boolean, 使用正则表达式或其他方法判断邮箱格式是否合法
 */
public class Demo3 {

    private final static Object object = new Object();

    //设计一个接收两个int数组的方法void, 使用多线程交替输出其中的元素
    public static void show(int[] arr1, int[] arr2) {

        //线程一
        Thread thread1 = new Thread(() -> {

            for (int i = 0; i < arr1.length; i++) {

                synchronized (object) {
                    System.out.println(arr1[i]);

                    //让当前线程唤醒其他线程
                    object.notify();

                    //让当前线程沉睡
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //线程二
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < arr2.length; i++) {

                synchronized (object) {
                    System.out.println(arr2[i]);

                    //让当前线程唤醒其他线程
                    object.notify();

                    //让当前线程沉睡
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    public static Boolean checkEmail(String email) {

        String regex1 = "[a-zA-Z0-9_]*@[a-zA-Z0-9]+[.][a-zA-Z0-9]+";
        //@后加字母或数字，后面加点，后面字母或数字
        String regex2 = "[a-zA-Z0-9_]*@[a-zA-Z0-9]+[.][a-zA-Z0-9]+[.][a-zA-Z0-9]+";
        //..........在regex1基础上，后面加.和其他字母组成的后缀

        if(email.matches(regex1) || email.matches(regex2)) {
            System.out.println("合法邮箱地址");
            return true;
        } else {
            System.out.println("不合法邮箱地址");
            return false;
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9}, arr2 = {2, 4, 6, 8, 10};
        show(arr1, arr2);

        System.out.println(checkEmail("1210002342@qq.com"));
    }

}
