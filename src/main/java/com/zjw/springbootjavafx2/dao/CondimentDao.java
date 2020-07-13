package com.zjw.springbootjavafx2.dao;

import com.zjw.springbootjavafx2.pojo.entity.Condiment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CondimentDao {
    int deleteByPrimaryKey(Integer cdmId);

    int insert(Condiment record);

    int insertSelective(Condiment record);

    Condiment selectByPrimaryKey(Integer cdmId);

    int updateByPrimaryKeySelective(Condiment record);

    int updateByPrimaryKey(Condiment record);

    List<Condiment> showAll();
}