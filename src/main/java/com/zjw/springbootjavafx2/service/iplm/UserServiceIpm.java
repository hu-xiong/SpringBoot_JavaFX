package com.zjw.springbootjavafx2.service.iplm;

import com.zjw.springbootjavafx2.dao.UserDao;
import com.zjw.springbootjavafx2.pojo.entity.User;
import com.zjw.springbootjavafx2.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceIpm implements UserService{

    @Resource
    UserDao userDao;

    public boolean userLoginCheck(String account,String password){
        User user = userDao.selectByUserNumber(account);
        boolean result = false;
        if (user != null && user.getUserPassword().equals(password)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
