package com.clark010.test;

public class Test {
    public static void print(String msg) {
        Utils.print("from Test - " + msg);
    }

    public static void main(String[] args) {
        print("hello Test");
    }
}
