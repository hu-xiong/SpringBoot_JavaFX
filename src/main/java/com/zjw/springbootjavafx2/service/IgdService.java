package com.zjw.springbootjavafx2.service;

import com.zjw.springbootjavafx2.pojo.entity.Ingredient;
import com.zjw.springbootjavafx2.pojo.VO.IgdVO;
import javafx.collections.ObservableList;

import java.util.List;

public interface IgdService {
    List<Ingredient> showAll();
    boolean saveIngredient(Ingredient ingredient);
    boolean updateIngredient(Ingredient ingredient);
    boolean deleteIngredientl(Integer IgdId);
}
