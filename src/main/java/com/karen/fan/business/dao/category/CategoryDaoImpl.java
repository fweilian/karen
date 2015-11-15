package com.karen.fan.business.dao.category;

import com.karen.fan.business.dao.AbstractBaseDaoImpl;
import com.karen.fan.business.mapper.CategoryMapper;
import com.karen.fan.business.mapper.CrudMapper;
import com.karen.fan.business.model.CategoryModel;
import com.karen.fan.common.entity.CategoryInfo;
import com.karen.fan.common.entity.PageInfo;
import com.karen.fan.common.exception.GlobalException;
import com.karen.fan.common.exception.SQLException;
import com.karen.fan.common.utils.JsonUtils;
import com.karen.fan.common.utils.TimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Date: 2015-10-25
 * @author: fan
 */
@Repository(value = "categoryDao")
public class CategoryDaoImpl extends AbstractBaseDaoImpl<CategoryModel, Long> implements CategoryDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryDaoImpl.class);

    @Resource(name = "categoryMapper")
    private CategoryMapper categoryMapper;

    @Override
    protected CrudMapper getMapper() {
        return categoryMapper;
    }

    @Override
    public List<CategoryInfo> findByParentId(int parentId, PageInfo pageInfo) throws GlobalException{
        List<CategoryInfo> categoryInfoList = null;
        List<CategoryModel> result = null;
        try {
            result = categoryMapper.findByParentIdAndPage(parentId, pageInfo);
            if(result != null && !result.isEmpty()) {
                categoryInfoList = convertCategoryInfoList(result);
            }
        } catch (SQLException e) {
            LOGGER.error("find categories by parent id failed, parentId={}, pageInfo={}, result={}",
                    parentId, JsonUtils.toJson(pageInfo), JsonUtils.toJson(result));
            throw new SQLException("find categories by parent id failed", e);
        }
        if(result == null) {
            LOGGER.warn("find categories by parent id RETURN NULL. parentId={}, pageInfo={}",
                    parentId, JsonUtils.toJson(pageInfo));
            throw new GlobalException("find categories by parent id RETURN NULL");
        }
        return categoryInfoList;
    }

    private List<CategoryInfo> convertCategoryInfoList(List<CategoryModel> result) {
        List<CategoryInfo> categoryInfoList = new ArrayList<CategoryInfo>();
        for(CategoryModel model : result) {
            CategoryInfo category = convertCategoryInfo(model);
            categoryInfoList.add(category);
        }
        return categoryInfoList;
    }

    private CategoryInfo convertCategoryInfo(CategoryModel model) {
        CategoryInfo category = new CategoryInfo();
        category.setCategoryId(model.getCategoryId());
        category.setParentId(model.getParentId());
        category.setCategoryName(model.getCategoryName());
        category.setDescription(model.getDescription());
        category.setOpenness(model.getOpenness());
        category.setBlogNumber(model.getBlogNumber());
        category.setCreateTime(TimeUtils.convertDateTimeToString(model.getCreateTime()));
        return category;
    }
}
