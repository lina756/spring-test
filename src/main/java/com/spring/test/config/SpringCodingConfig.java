package com.spring.test.config;

import com.spring.test.bean.JDNewsListener;
import com.spring.test.bean.NewsProviceder;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.*;

public class SpringCodingConfig {

    public static BeanFactory codingProviced(BeanDefinitionRegistry registry) {

        AbstractBeanDefinition newsProviceder = new RootBeanDefinition(NewsProviceder.class);
        AbstractBeanDefinition newsListener = new RootBeanDefinition(JDNewsListener.class);

        registry.registerBeanDefinition("newsProviceder",newsProviceder);
        registry.registerBeanDefinition("jdNewsListener", newsListener);

        ConstructorArgumentValues argValues = new ConstructorArgumentValues();
        argValues.addIndexedArgumentValue(0, newsListener);

        newsProviceder.setConstructorArgumentValues(argValues);

        MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
        mutablePropertyValues.addPropertyValue("newsListener", newsListener);

        newsProviceder.setPropertyValues(mutablePropertyValues);
        return (BeanFactory)registry;
    }

    public static BeanFactory codingProvicedByProperties(BeanDefinitionRegistry registry) {

        BeanDefinitionReader reader = new PropertiesBeanDefinitionReader(registry);
        reader.loadBeanDefinitions("classpath:config.properties");
        return (BeanFactory)registry;
    }

}
