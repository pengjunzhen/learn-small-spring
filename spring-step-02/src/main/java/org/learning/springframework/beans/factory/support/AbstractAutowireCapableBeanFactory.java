package org.learning.springframework.beans.factory.support;

import org.learning.springframework.beans.BeansException;
import org.learning.springframework.beans.factory.config.BeanDefinition;

/**
 * 实现 默认Bean创建的抽象bean工厂超类
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {

        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        registerSingleton(beanName, bean);
        return bean;
    }
}
