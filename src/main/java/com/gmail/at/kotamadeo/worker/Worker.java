package com.gmail.at.kotamadeo.worker;

public class Worker {
    private final OnTaskDoneListener onTaskDoneListener;
    private final OnTaskErrorListener onTaskErrorListener;

    public Worker(OnTaskDoneListener onTaskDoneListener, OnTaskErrorListener onTaskErrorListener) {
        this.onTaskDoneListener = onTaskDoneListener;
        this.onTaskErrorListener = onTaskErrorListener;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != 33) {
                onTaskDoneListener.onDone("Task " + i + " is done");
            } else {
                onTaskErrorListener.onError("Error!");
            }
        }
    }
}
