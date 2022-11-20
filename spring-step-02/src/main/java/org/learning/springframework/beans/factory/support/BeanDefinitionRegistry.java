package org.learning.springframework.beans.factory.support;

import org.learning.springframework.beans.factory.config.BeanDefinition;

/**
 * Bean定义 注册接口
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName       Bean 名称
     * @param beanDefinition Bean 定义
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
