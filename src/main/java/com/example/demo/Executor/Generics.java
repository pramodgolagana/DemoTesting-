package com.example.demo.Executor;

import java.util.List;

public class Generics {
    public static <k>void printList(List<k> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Apple", "Banana", "Cherry");
        List<Integer> intList = List.of(1, 2, 3);

        printList(stringList); // Works for List<String>
        printList(intList);    // Works for List<Integer>
        Thread thread= new Thread();
    }
}
