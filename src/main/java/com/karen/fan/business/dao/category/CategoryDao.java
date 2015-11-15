package com.karen.fan.business.dao.category;

import com.karen.fan.business.dao.BaseDao;
import com.karen.fan.business.model.CategoryModel;
import com.karen.fan.common.entity.CategoryInfo;
import com.karen.fan.common.entity.PageInfo;
import com.karen.fan.common.exception.GlobalException;

import java.util.List;

/**
 * @Date: 2015-10-25
 * @author: fan
 */
public interface CategoryDao extends BaseDao<CategoryModel, Long> {

    List<CategoryInfo> findByParentId(int parentId, PageInfo pageInfo) throws GlobalException;
}
