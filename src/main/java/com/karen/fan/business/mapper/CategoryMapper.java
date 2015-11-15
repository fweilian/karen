package com.karen.fan.business.mapper;

import com.karen.fan.business.model.CategoryModel;
import com.karen.fan.common.entity.PageInfo;
import com.karen.fan.common.exception.SQLException;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Date: 2015-10-25
 * @author: fan
 */
@Repository(value = "categoryMapper")
public interface CategoryMapper extends CrudMapper<CategoryModel, Long> {

    List<CategoryModel> findByParentIdAndPage(int parentId, PageInfo pageInfo) throws SQLException;
}
