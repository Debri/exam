package com.bjhetang.manager;

import com.bjhetang.domain.Account;
import com.bjhetang.domain.Page;

import java.util.List;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */
public interface AccountDao extends BaseDao<Account> {
    public List<Account> SelectByPage(Page page);
}
