package com.ju.service;



import com.ju.domain.Account;

import java.util.List;

/**
 * @Classname AccountService
 * @Description TODO
 * @Date 2020/10/30 22:35
 * @Created by JuZongQuan
 */
public interface AccountService {
    public List<Account> findall();
    public void save(Account account);
}
