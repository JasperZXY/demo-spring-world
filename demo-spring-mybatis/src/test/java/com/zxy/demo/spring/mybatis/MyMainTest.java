package com.zxy.demo.spring.mybatis;

import com.zxy.demo.spring.mybatis.service.UserService;
import com.zxy.demo.spring.mybatis.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MyMainTest {
    private static final Logger logger = LoggerFactory.getLogger(MyMainTest.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        logger.info(Arrays.toString(context.getBeanDefinitionNames()));
        UserService userService = context.getBean("userService", UserServiceImpl.class);
        logger.info("v1:" + userService.getById(1L));
        logger.info("v2:" + userService.getByIdV2(1L));
        logger.info("v3:" + userService.getByIdV3(1L));
        logger.info("v4:" + userService.getByIdV4(1L));
        for (int i=0; i<10; i++) {
            logger.info("1:" + userService.getById(1L));
            logger.info("-1:" + userService.getById(-1L));

            logger.info("1_:" + userService.getByIdV2(1L));
        }

    }
}
