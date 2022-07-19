package com.gmail.at.kotamadeo.worker;
@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
