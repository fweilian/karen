package com.karen.fan.common.entity;

/**
 * @Date: 2015-10-25
 * @author: fan
 */
public class CategoryInfo {
    private Long categoryId;
    private Long parentId;
    private String categoryName;
    private String description;
    private Integer openness;
    private String createTime;
    private Integer blogNumber;

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getBlogNumber() {
        return blogNumber;
    }

    public void setBlogNumber(Integer blogNumber) {
        this.blogNumber = blogNumber;
    }
}
