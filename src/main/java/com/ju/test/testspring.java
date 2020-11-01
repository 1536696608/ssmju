package com.ju.test;

import com.ju.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname testspring
 * @Description TODO
 * @Date 2020/10/30 23:00
 * @Created by JuZongQuan
 */
public class testspring {
    @Test
    public void run(){
        ApplicationContext  ac = new ClassPathXmlApplicationContext("classpath:application.xml");

        AccountService as = (AccountService) ac.getBean("accountService");

        as.findall();
    }

}
