package com.spring.test.bean;

public class NewsProviceder implements BeanPostProcessorTest {

    private NewsListener newsListener;

    public NewsProviceder(NewsListener newsListener) {
        this.newsListener = newsListener;
    }

    public NewsListener getNewsListener() {
        return newsListener;
    }

    public void setNewsListener(NewsListener newsListener) {
        this.newsListener = newsListener;
    }

    public void readNews() {
        newsListener.getNews();
    }
}
