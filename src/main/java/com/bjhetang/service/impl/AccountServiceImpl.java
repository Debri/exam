package com.bjhetang.service.impl;

import com.bjhetang.domain.Account;
import com.bjhetang.domain.Page;
import com.bjhetang.manager.AccountDao;
import com.bjhetang.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    public boolean addAccount(Account account) {
        if (account != null) {
            return accountDao.addEntity(account) == 1;
        }
        return false;

    }

    public boolean delAccount(Integer id) {
        if (id > 0) {
            return accountDao.deleteByPrimaryKey(id) == 1;
        }
        return false;

    }

    public boolean modifyAccount(Account account) {
        if (account != null || account.getId() <= 0) {
            return false;
        } else {
            return accountDao.updateByPrimaryKey(account) == 1;
        }

    }

    public Account selectAccount(Integer id) {
        if (id > 0) {
            return accountDao.selectByPrimaryKey(id);
        }
        return null;
    }

    public List<Account> selectAllAccount() {
        return accountDao.selectAll();
    }

    public List<Account> selectAccountByPage(Page page) {
        page.setPageNow(page.getPageNow() + page.getPageSize());
        return accountDao.selectByPage(page);
    }

    public boolean lockAccount(Integer id) {
        if (id > 0 && accountDao.checkStatus(id)) {

            return accountDao.lockAccount(id) == 1;


        }
        return false;
    }

    public boolean unlockAccount(Integer id) {
        if (id > 0 && !accountDao.checkStatus(id)) {
            return accountDao.unlockAccount(id) == 1;
        }
        return false;
    }
}
