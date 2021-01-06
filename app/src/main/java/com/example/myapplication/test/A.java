package com.example.myapplication.test;

public class A extends B {

    public boolean a = true;
    public A(){
        System.out.println("public a = " + a);
    }

    @Override
    void initData() {
        System.out.println("initData a = " + a);
    }
}
