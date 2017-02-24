package com.bjhetang.manager.impl;

import com.bjhetang.domain.Account;
import com.bjhetang.domain.Page;
import com.bjhetang.manager.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})
public class AccountDaoImplTest {
    @Resource
    private AccountDao accountDao;

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Account account = new Account();
        account = accountDao.selectByPrimaryKey(1);
        System.out.println(account.getStatus());
        System.out.println(account.getLatestLoginTime());

    }

    @Test
    public void testSelectAll() throws Exception {
        List<Account> list = new ArrayList<Account>();
        list = accountDao.SelectByPage(new Page(1));
        for (Account account : list) {
            System.out.println(account.getId());
        }

    }

    @Test
    public void testAddEntity() throws Exception {
        Account account = new Account();
        account.setId(2);
        // account.setType(2);
        account.setCreateTime(new Date (System.currentTimeMillis()));
        account.setStatus(false);
        account.setLatestLoginTime(new Date( System.currentTimeMillis()));
        account.setName("123");
        account.setRemark("234");
        accountDao.addEntity(account);

    }

    @Test
    public void testDeleteByPrimaryKey() throws Exception {
        System.out.println(accountDao.deleteByPrimaryKey(2));

    }

    @Test
    public void testUpdateByPrimaryKey() throws Exception {
        Account account = new Account();
        account.setId(12);
        // account.setType(2);
        account.setCreateTime(new Date(System.currentTimeMillis()));
        account.setStatus(false);
        account.setLatestLoginTime(new Date(System.currentTimeMillis()));
        account.setName("123");
        account.setRemark("234");
        System.out.println(  accountDao.updateByPrimaryKey(account));

    }

}