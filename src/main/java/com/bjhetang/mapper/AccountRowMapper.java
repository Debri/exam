package com.bjhetang.mapper;

import com.bjhetang.domain.Account;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */
public class AccountRowMapper implements RowMapper<Account> {

    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        AccountExtractor accountExtractor = new AccountExtractor();
        return accountExtractor.extractData(rs);
    }

    class AccountExtractor implements ResultSetExtractor<Account> {
        public Account extractData(ResultSet rs) throws SQLException, DataAccessException {
            Account account = new Account();
            account.setId(rs.getInt(1));
            account.setName(rs.getString(2));
            account.setRemark(rs.getString(3));
            account.setStatus(rs.getBoolean(4));
            account.setCreateTime(rs.getDate(5));
            account.setLatestLoginTime(rs.getDate(6));
            account.setType(rs.getShort(7));
            return account;

        }
    }
}
