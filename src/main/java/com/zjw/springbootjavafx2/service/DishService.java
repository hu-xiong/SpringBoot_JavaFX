package com.zjw.springbootjavafx2.service;

import com.zjw.springbootjavafx2.pojo.DTO.DishDTO;
import com.zjw.springbootjavafx2.pojo.entity.Dish;

import java.util.List;

public interface DishService {
    List<Dish> showAllDishes();
}
