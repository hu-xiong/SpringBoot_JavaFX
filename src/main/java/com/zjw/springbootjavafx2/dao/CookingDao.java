package com.zjw.springbootjavafx2.dao;

import com.zjw.springbootjavafx2.pojo.entity.Cooking;
import com.zjw.springbootjavafx2.pojo.entity.CookingKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CookingDao {
    int deleteByPrimaryKey(CookingKey key);

    int insert(Cooking record);

    int insertSelective(Cooking record);

    Cooking selectByPrimaryKey(CookingKey key);

    int updateByPrimaryKeySelective(Cooking record);

    int updateByPrimaryKey(Cooking record);
}