package com.ju.domain;

import java.io.Serializable;

/**
 * @Classname Account
 * @Description TODO
 * @Date 2020/10/30 22:30
 * @Created by JuZongQuan
 */
public class Account implements Serializable {
    private Integer id;
    private String Name;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", money=" + money +
                '}';
    }
}
