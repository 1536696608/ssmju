package com.ju.service.impl;


import com.ju.dao.AccountDao;
import com.ju.domain.Account;
import com.ju.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname AccountServiceImpl
 * @Description TODO
 * @Date 2020/10/30 22:36
 * @Created by JuZongQuan
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findall() {
        System.out.println("业务层查询所有信息");
        return accountDao.findall();
    }

    @Override
    public void save(Account account) {
        System.out.println("业务层保存信息");
        accountDao.save(account);
    }
}
