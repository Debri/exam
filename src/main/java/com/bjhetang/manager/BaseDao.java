package com.bjhetang.manager;

import java.util.List;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */

/**
 * DAO层的基础操作接口
 *
 * @param <T> 实体泛型类
 */
public interface BaseDao<T> {
    /**
     * 根据主键查找
     *
     * @param id
     * @return
     */
    public T selectByPrimaryKey(Integer id);

    /**
     * 查找所有
     *
     * @return
     */
    public List<T> selectAll();

    /**
     * 添加实体
     *
     * @param obj
     * @return
     */
    public Integer addEntity(T obj);

    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    public Integer deleteByPrimaryKey(Integer id);

    /**
     * 根据主键修改
     *
     * @param obj
     * @return
     */
    public Integer updateByPrimaryKey(T obj);


}
