package com.ju.test;

import com.ju.dao.AccountDao;
import com.ju.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Classname testMybasit
 * @Description TODO
 * @Date 2020/10/31 15:05
 * @Created by JuZongQuan
 */
public class testMybasit {

    @Test
    public void run2() throws IOException {

        Account account = new Account();
        account.setName("鸡鸡");
        account.setMoney(302.);
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();

        AccountDao accountDao = session.getMapper(AccountDao.class);

//        accountDao.save(account);
        List<Account> accounts = accountDao.findall();
        for (Account a : accounts){
            System.out.println(a);
        }


        session.close();

        in.close();
    }
}