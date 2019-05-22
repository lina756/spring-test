package com.spring.test.bean;


public class JDNewsListener implements NewsListener {

    @Override
    public void getNews() {
        System.out.println("get News!!");
    }
}
