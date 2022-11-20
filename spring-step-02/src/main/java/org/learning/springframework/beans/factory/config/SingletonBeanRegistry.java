package org.learning.springframework.beans.factory.config;

/**
 * 单例 Bean 注册表
 */
public interface SingletonBeanRegistry {

    /**
     * 返回 给定名称下注册的（原始）单例对象。
     *
     * @param beanName 要查找的bean的名称
     * @return 返回注册的单例对象
     */
    Object getSingleton(String beanName);

    /**
     * 注册单例对象
     *
     * @param beanName            Bean 对象名称
     * @param singletonBeanObject Bean 对象
     */
    void registerSingleton(String beanName, Object singletonBeanObject);
}
