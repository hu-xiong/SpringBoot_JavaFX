package com.zjw.springbootjavafx2.service.iplm;

import com.zjw.springbootjavafx2.dao.IngredientDao;
import com.zjw.springbootjavafx2.pojo.entity.Ingredient;
import com.zjw.springbootjavafx2.service.IgdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IgdServiceIpm implements IgdService {
    @Resource
    IngredientDao ingredientDao;

    @Override
    public List<Ingredient> showAll() {
        List<Ingredient> list = ingredientDao.selectAll();
        return list;
    }

    @Override
    public boolean saveIngredient(Ingredient ingredient) {
        if (ingredientDao.insertSelective(ingredient)==1){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateIngredient(Ingredient ingredient) {
        int i = ingredientDao.updateByPrimaryKey(ingredient);
        if(i == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteIngredientl(Integer IgdId) {
       int i = ingredientDao.deleteByPrimaryKey(IgdId);
       if(i == 1 ){
           return true;
       }
        return false;
    }


}
