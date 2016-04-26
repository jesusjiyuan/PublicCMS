package com.publiccms.entities.sys;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.source.entity.MyColumn;

/**
 * SysDeptCategory generated by hbm2java
 */
@Entity
@Table(name = "sys_dept_category")
public class SysDeptCategory implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Integer id;
    @MyColumn(title = "部门", condition = true)
    private int deptId;
    @MyColumn(title = "分类", condition = true)
    private int categoryId;

    public SysDeptCategory() {
    }

    public SysDeptCategory(int deptId, int categoryId) {
        this.deptId = deptId;
        this.categoryId = categoryId;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "dept_id", nullable = false)
    public int getDeptId() {
        return this.deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Column(name = "category_id", nullable = false)
    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

}