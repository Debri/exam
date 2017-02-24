package com.bjhetang.domain;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */

import java.util.Date;

/**
 * 对应是聚酷account表
 */
public class Account {
    int id;
    String name;
    String remark;      //备注
    boolean status;
    Date createTime;
    Date latestLoginTime;
    short type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account account = (Account) o;
        return getId() != account.getId();

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getRemark().hashCode();
        result = 31 * result + (getStatus() ? 1 : 0);
        result = 31 * result + getCreateTime().hashCode();
        result = 31 * result + getLatestLoginTime().hashCode();
        result = 31 * result + (int) getType();
        return result;
    }

    /**
     * getters and setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLatestLoginTime() {
        return latestLoginTime;
    }

    public void setLatestLoginTime(Date latestLoginTime) {
        this.latestLoginTime = latestLoginTime;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }
}
