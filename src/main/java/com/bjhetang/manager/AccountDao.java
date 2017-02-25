package com.bjhetang.manager;

import com.bjhetang.domain.Account;
import com.bjhetang.domain.Page;

import java.util.List;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */
public interface AccountDao extends BaseDao<Account> {
    /**
     * 分页查询
     *
     * @param page
     * @return
     */
    public List<Account> selectByPage(Page page);

    /**
     * 查找账户是否存在
     *
     * @param id
     * @return
     */
    public Integer selectIfExist(Integer id);

    /**
     * 封存账号
     */
    public Integer lockAccount(Integer id);

    /**
     * 解封账号
     *
     * @param id
     * @return
     */
    public Integer unlockAccount(Integer id);

    /**
     * 查询账号的封存状态
     *
     * @param id
     * @return
     */
    public boolean checkStatus(Integer id);

}
