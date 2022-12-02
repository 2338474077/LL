package com.me.zy.exception;

/**
 * 买动物余额不足异常
 */
public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
