package com.spring.test;

import com.spring.test.bean.BeanPostProcessorImpl;
import com.spring.test.bean.NewsProviceder;
import com.spring.test.config.SpringCodingConfig;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

public class MainApplication {

    public static void main(String[] args) {
        /*DefaultListableBeanFactory registry = new DefaultListableBeanFactory();
        BeanFactory beanFactory = SpringCodingConfig.codingProviced(registry);
        NewsProviceder newsProviceder = beanFactory.getBean(NewsProviceder.class);
        newsProviceder.readNews();*/

        DefaultListableBeanFactory registry = new DefaultListableBeanFactory();
        ConfigurableBeanFactory beanFactory = (ConfigurableBeanFactory)SpringCodingConfig.codingProvicedByProperties(registry);
        beanFactory.addBeanPostProcessor(new BeanPostProcessorImpl());
        NewsProviceder newsProviceder = beanFactory.getBean(NewsProviceder.class);
        newsProviceder.readNews();

       /* System.out.println(RandomStringUtils.random(12,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'));
        System.out.println(RandomStringUtils.random(12,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'));
        System.out.println(RandomStringUtils.random(12,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'));
        System.out.println(RandomStringUtils.random(12,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'));
        System.out.println(RandomStringUtils.random(12,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'));
      */
        /*System.out.println(test());*/

        /*boolean isEat = true;
        if (isEat) System.out.println("吃了！！");
        if (isEat == true) System.out.println("真吃了！！");*/
    }

   /* private static void test(int size) {
            draw(size);
    }

    private static void draw(int center) {
        int xunhuan = 1;
        int j = 0;
        int jiajianchushizhicount = 0; *//*加减使用的次数*//*
        int jiajian = 0; *//*0：不加不减，1加 ，-1减*//*
        int hengshu = 1; *//*0：横， 1：竖*//*
        int x = -1, y = 0;
        int num = 1; *//*每个格子对应的值*//*
        int[][] pic = new int[center][center];
        jiajian = 1;
        for (int i = 0; center - i > 0; i++) {
            int count = center - i;
            while(xunhuan > 0) {
                jiajianchushizhicount++;
                for (j = 0;j < count; j++) {
                    switch(hengshu) {
                        case 0:
                            switch (jiajian) {
                                case 1:
                                    y++;
                                    pic[x][y] = num++;
                                    break;
                                case -1:
                                    y--;
                                    pic[x][y] = num++;
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 1:
                            switch (jiajian) {
                                case 1: {
                                    x++;
                                    pic[x][y] = num++;
                                    break;
                                }case -1: {
                                    x--;
                                    pic[x][y] = num++;
                                    break;
                                }default:
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                xunhuan--;
                hengshu = hengshu == 0 ? 1 : 0;
                jiajian = jiajianchushizhicount % 2 == 0 ? jiajian > 0? -1 : 1 : jiajian;
            }
            xunhuan = 2;
        }

        for (int i = 0; i < center; i++) {
            for (j = 0; j < center; j++) {
                System.out.print(pic[i][j] + " ");
            }
            System.out.println();
        }
    }*/

}
