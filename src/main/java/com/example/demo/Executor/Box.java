package com.example.demo.Executor;

public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(42);

        // Warning: Unchecked cast
        int value =  integerBox.getContent();  // Compiler issues an unchecked cast warning
        System.out.println(value);
    }

}