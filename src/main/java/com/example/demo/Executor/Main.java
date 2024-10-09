package com.example.demo.Executor;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for(int i=1;i<111;i++){
            if(i==44){
                System.out.println("Debug");
            }
            printNumber p =new printNumber(i);
            executorService.execute(p);
            List<? extends Number> numbers = new ArrayList<Integer>();

        }
    }
}
