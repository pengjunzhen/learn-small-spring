package org.learning.springframework.beans.factory.support;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.learning.springframework.beans.factory.config.BeanDefinition;

public class BeanFactoryTest {

    @Test
    public void testBeanFactory() {

        // 1、初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2、 注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        Assertions.assertEquals("查询用户信息", userService.queryUserInfo());

        // 4、第二次获取 bean from Singleton
        UserService userService2 = (UserService) beanFactory.getBean("userService");
        Assertions.assertEquals("查询用户信息", userService2.queryUserInfo());
    }
}
