package com.ju.dao;

import com.ju.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname AccountDao
 * @Description TODO
 * @Date 2020/10/30 22:33
 * @Created by JuZongQuan
 */

@Repository
public interface AccountDao {

    @Select("select * from ssm.account")
    public List<Account> findall();

    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void save(Account account);
}
