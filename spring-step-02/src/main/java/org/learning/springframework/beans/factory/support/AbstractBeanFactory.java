package org.learning.springframework.beans.factory.support;

import org.learning.springframework.beans.BeansException;
import org.learning.springframework.beans.factory.BeanFactory;
import org.learning.springframework.beans.factory.config.BeanDefinition;

/**
 * 抽象的 Bean 工厂基类，定义模板方法
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        // 如果通过名字找到已经存在的对象，直接返回；否则找到bean的定义信息，通过定义的信息去创建bean
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

}
