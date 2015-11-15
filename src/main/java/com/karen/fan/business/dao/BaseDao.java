package com.karen.fan.business.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @Date: 2015-10-24
 * @author: fan
 */
public interface BaseDao<T, ID extends Serializable> {

    <S extends T> Long save(S entity);

    T findOne(ID id);

    List<T> findAll();

    <S extends T> void modify(S entity);

    void delete(ID id);

    void deleteAll();
}
