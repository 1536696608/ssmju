package com.ju.contorler;

import com.ju.domain.Account;
import com.ju.service.AccountService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname AccountControler
 * @Description TODO
 * @Date 2020/10/30 22:37
 * @Created by JuZongQuan
 */
@Controller
@RequestMapping("/account")
public class AccountControler {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findall")
    public String findAll(Model model){
        System.out.println("表现层查询所有信息");
        List<Account> accounts = accountService.findall();
//        Account account = new Account();
//        account.setName("yy");
//        account.setId(4);
//        account.setMoney(444.);
//        List<Account> accounts = new ArrayList<>();
//        accounts.add(account);
        model.addAttribute("accounts",accounts);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.save(account);
        response.sendRedirect(request.getContextPath()+"/account/findall");
        return  ;
    }
}
