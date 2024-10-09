package com.example.demo.Executor;

public class printNumber implements Runnable{
    private int number;
    public printNumber(int number) {
        this.number=number;
    }

    @Override
    public void run() {
        System.out.println(number+" "+Thread.currentThread().getName());
    }
}
