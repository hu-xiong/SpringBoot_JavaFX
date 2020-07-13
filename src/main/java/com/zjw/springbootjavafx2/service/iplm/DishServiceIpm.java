package com.zjw.springbootjavafx2.service.iplm;

import com.zjw.springbootjavafx2.dao.CookingDao;
import com.zjw.springbootjavafx2.dao.DishDao;
import com.zjw.springbootjavafx2.pojo.DTO.DishDTO;
import com.zjw.springbootjavafx2.pojo.entity.Cooking;
import com.zjw.springbootjavafx2.pojo.entity.Dish;
import com.zjw.springbootjavafx2.service.DishService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DishServiceIpm implements DishService {

    @Resource
    DishDao dishDao;

    @Override
    public List<Dish> showAllDishes() {
         List<Dish> dishList =  dishDao.selectAll();

         return dishList;
    }
}
