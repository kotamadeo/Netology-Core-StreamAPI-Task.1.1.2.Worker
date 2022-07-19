package com.gmail.at.kotamadeo.worker;
@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
