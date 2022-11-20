package org.learning.springframework.beans.factory;

import org.learning.springframework.beans.BeansException;

/**
 * 简单的 Bean 工厂
 */
public interface BeanFactory {


    Object getBean(String name) throws BeansException;
}
