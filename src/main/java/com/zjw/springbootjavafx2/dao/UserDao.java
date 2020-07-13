package com.zjw.springbootjavafx2.dao;

import com.zjw.springbootjavafx2.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUserNumber(String userNumber);
}