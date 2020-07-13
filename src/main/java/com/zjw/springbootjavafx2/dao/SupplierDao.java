package com.zjw.springbootjavafx2.dao;

import com.zjw.springbootjavafx2.pojo.entity.Supplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierDao {
    int deleteByPrimaryKey(Integer supplierId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer supplierId);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);

    List<Supplier> selectAll();
}