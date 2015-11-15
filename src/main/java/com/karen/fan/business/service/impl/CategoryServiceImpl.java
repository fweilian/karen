package com.karen.fan.business.service.impl;

import com.karen.fan.business.dao.category.CategoryDao;
import com.karen.fan.business.model.CategoryModel;
import com.karen.fan.business.service.CategoryService;
import com.karen.fan.common.entity.CategoryInfo;
import com.karen.fan.common.entity.PageInfo;
import com.karen.fan.common.exception.GlobalException;
import com.karen.fan.common.utils.TimeUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Date: 2015-10-25
 * @author: fan
 */
@Service(value = "categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;

    @Override
    public Long addCategory(CategoryInfo categoryInfo) {
        CategoryModel model = new CategoryModel(categoryInfo.getParentId(), categoryInfo.getCategoryName(),
                categoryInfo.getDescription(), categoryInfo.getOpenness(), TimeUtils.currentDateTime());
        return categoryDao.save(model);
    }

    @Override
    public List<CategoryInfo> getCategories(int parentId, PageInfo pageInfo) throws GlobalException {
        return categoryDao.findByParentId(parentId, pageInfo);
    }
}
