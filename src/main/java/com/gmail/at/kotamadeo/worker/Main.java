package com.gmail.at.kotamadeo.worker;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener done = System.out::println;
        OnTaskErrorListener error = System.out::println;
        Worker worker = new Worker(done, error);
        worker.start();
    }
}