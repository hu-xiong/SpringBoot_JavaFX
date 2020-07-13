package com.zjw.springbootjavafx2.dao;

import com.zjw.springbootjavafx2.pojo.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishDao {
    int deleteByPrimaryKey(String dishName);

    int insert(Dish record);

    int insertSelective(Dish record);

    Dish selectByPrimaryKey(String dishName);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKey(Dish record);

    List<Dish> selectAll();
}