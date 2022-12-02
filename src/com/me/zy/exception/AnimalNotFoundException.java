package com.me.zy.exception;

/**
 * 店内没有动物时 的 异常
 */
public class AnimalNotFoundException extends RuntimeException{
    public AnimalNotFoundException(String message) {
        super(message);
    }
}
