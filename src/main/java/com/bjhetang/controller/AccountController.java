package com.bjhetang.controller;

import com.bjhetang.domain.Account;
import com.bjhetang.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */
@Controller(value = "accountController")
@RequestMapping(value = "/account/")
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping(value = "all.do")
    @ResponseBody
    public List<Account> listAllAccount(HttpServletRequest request) {
        return accountService.selectAllAccount();
    }

    @RequestMapping(value = "page.do")
    @ResponseBody
    public void listAccountByPage(HttpServletRequest request) {

    }

    @RequestMapping(value = "id.do")
    @ResponseBody
    public void listAccountById(HttpServletRequest request) {

    }

    @RequestMapping(value = "del.do")
    @ResponseBody
    public void delAccount(HttpServletRequest request) {

    }

    @RequestMapping(value = "modify.do")
    @ResponseBody
    public void modifyAccount(HttpServletRequest request) {

    }

    @RequestMapping(value = "lock.do")
    public void lockAccount(HttpServletRequest request) {

    }

    @RequestMapping(value = "unlock.do")
    public void unlockAccount(HttpServletRequest request) {

    }

}
