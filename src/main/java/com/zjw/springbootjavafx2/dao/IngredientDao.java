package com.zjw.springbootjavafx2.dao;

import com.zjw.springbootjavafx2.pojo.entity.Ingredient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IngredientDao {
    int deleteByPrimaryKey(Integer igdId);

    int insert(Ingredient record);

    int insertSelective(Ingredient record);

    Ingredient selectByPrimaryKey(Integer igdId);

    int updateByPrimaryKeySelective(Ingredient record);

    int updateByPrimaryKey(Ingredient record);

    List<Ingredient> selectAll();
}