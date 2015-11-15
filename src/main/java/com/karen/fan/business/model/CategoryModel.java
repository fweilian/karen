package com.karen.fan.business.model;

import java.util.Date;

/**
 * @Date: 2015-10-25
 * @author: fan
 */
public class CategoryModel {
    private Long categoryId;
    private Long parentId;
    private String categoryName;
    private String description;
    private Integer openness;
    private Date createTime;
    private Integer blogNumber;

    public CategoryModel(Long parentId, String categoryName, String description,
                         Integer openness, Date createTime) {
        this.parentId = parentId;
        this.categoryName = categoryName;
        this.description = description;
        this.openness = openness;
        this.createTime = createTime;
        this.blogNumber = 0;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOpenness() {
        return openness;
    }

    public void setOpenness(Integer openness) {
        this.openness = openness;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getBlogNumber() {
        return blogNumber;
    }

    public void setBlogNumber(Integer blogNumber) {
        this.blogNumber = blogNumber;
    }
}
