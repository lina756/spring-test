package com.spring.test.bean;

public class DWNewsListener implements NewsListener {

    @Override
    public void getNews() {
        System.out.println("哈哈哈，getNews！！");
    }

}
