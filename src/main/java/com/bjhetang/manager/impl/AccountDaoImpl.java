package com.bjhetang.manager.impl;

import com.bjhetang.domain.Account;
import com.bjhetang.domain.Page;
import com.bjhetang.manager.AccountDao;
import com.bjhetang.mapper.AccountRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public Account selectByPrimaryKey(Integer id) {
        List<Account> list = new ArrayList<Account>();
        String sql = "select * from account where account_id = " + id;
        list = jdbcTemplate.query(sql, new AccountRowMapper());
        return list.get(0);
    }

    public List selectAll() {

        List<Account> list = new ArrayList<Account>();
        String sql = "select * from account order by account_id ASC ";
        list = jdbcTemplate.query(sql, new AccountRowMapper());
        return list;
    }

    public Integer addEntity(Account account) {
        String sql = "insert into account (account_id,name,remark,status,create_time,latest_login_time,type) values (?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{account.getId(), account.getName(), account.getRemark(), account.getStatus(), new Date(account.getCreateTime().getTime()), new Date(account.getCreateTime().getTime()), account.getType()});

    }


    public Integer deleteByPrimaryKey(Integer id) {
        String sql = "delete from account where account_id=" + id;
        return jdbcTemplate.update(sql);
    }

    public Integer updateByPrimaryKey(Account account) {
        String sql = "UPDATE  account set name=? ,remark=?,status=?,create_time=?,latest_login_time=?,type=? where account_id=" + account.getId();
        return jdbcTemplate.update(sql, new Object[]{account.getName(), account.getRemark(), account.getStatus(), account.getCreateTime(), account.getLatestLoginTime(), account.getType()});
    }

    public List<Account> SelectByPage(Page page) {
        List<Account> list = new ArrayList<Account>();
        String sql = "select * from account order by account_id ASC limit " + page.getPageNow() + "," + page.getPageSize();
        list = jdbcTemplate.query(sql, new AccountRowMapper());
        return list;
    }
}
