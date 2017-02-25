package com.bjhetang.service;

import com.bjhetang.domain.Account;
import com.bjhetang.domain.Page;

import java.util.List;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */
public interface AccountService {
    public boolean addAccount(Account account);

    public boolean delAccount(Integer id);

    public boolean modifyAccount(Account account);

    public Account selectAccount(Integer id);

    public List<Account> selectAllAccount();

    public List<Account> selectAccountByPage(Page page);

    public boolean lockAccount(Integer id);

    public boolean unlockAccount(Integer id);
}
