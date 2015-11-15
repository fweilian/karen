package com.karen.fan.business.mapper;

import java.io.Serializable;

/**
 * @Date: 2015-10-24
 * @author: fan
 */
public interface CrudMapper<T, ID extends Serializable> {
    <S extends T> Long save(S entity);

    T findOne(ID id);

    Long count();

    <S extends T> void modify(S entity);

    void delete(ID id);
}
