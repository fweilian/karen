package com.karen.fan.business.service;

import com.karen.fan.common.entity.CategoryInfo;
import com.karen.fan.common.entity.PageInfo;
import com.karen.fan.common.exception.GlobalException;

import java.util.List;

/**
 * @Date: 2015-10-25
 * @author: fan
 */
public interface CategoryService {
    Long addCategory(CategoryInfo categoryInfo);

    List<CategoryInfo> getCategories(int parentId, PageInfo pageInfo) throws GlobalException;

}
