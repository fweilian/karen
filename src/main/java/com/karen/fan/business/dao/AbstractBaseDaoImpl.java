package com.karen.fan.business.dao;

import com.karen.fan.business.mapper.CrudMapper;

import java.io.Serializable;
import java.util.List;

/**
 * @Date: 2015-10-24
 * @author: fan
 */
public abstract class AbstractBaseDaoImpl<T, ID extends Serializable> implements BaseDao<T, ID> {
    protected abstract CrudMapper getMapper();

    @Override
    public <S extends T> Long save(S entity) {
        return this.getMapper().save(entity);
    }

    @Override
    public T findOne(ID id) {
        return (T) this.getMapper().findOne(id);
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public <S extends T> void modify(S entity) {

    }

    @Override
    public void delete(ID id) {

    }

    @Override
    public void deleteAll() {

    }
}
