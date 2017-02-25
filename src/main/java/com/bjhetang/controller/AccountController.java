package com.bjhetang.controller;

import com.bjhetang.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */
@Controller(value = "accountController")
@RequestMapping(value = "/account")
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping(value = "all.do")
    public void listAllAccount(HttpServletRequest request) {

    }

    @RequestMapping(value = "page.do")
    public void listAccountByPage(HttpServletRequest request) {

    }

    @RequestMapping(value = "id.do")
    public void listAccountById(HttpServletRequest request) {

    }

    @RequestMapping(value = "del.do")
    public void delAccount(HttpServletRequest request) {

    }

    @RequestMapping(value = "modify.do")
    public void modifyAccount(HttpServletRequest request) {

    }

    @RequestMapping(value = "lock.do")
    public void lockAccount(HttpServletRequest request) {

    }

    @RequestMapping(value = "unlock.do")
    public void unlockAccount(HttpServletRequest request) {

    }

}
