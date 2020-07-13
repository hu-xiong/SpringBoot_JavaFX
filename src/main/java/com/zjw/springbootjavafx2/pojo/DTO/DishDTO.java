package com.zjw.springbootjavafx2.pojo.DTO;

import com.zjw.springbootjavafx2.pojo.entity.Dish;

public class DishDTO extends Dish {

    private String cookingFoodId1;

    private String cookingFoodId2;

    private String cookingFoodAmoun1;

    private String cookingFoodAmoun2;

    private String cdm;

    public DishDTO() {
    }

    public DishDTO(String cookingFoodId1, String cookingFoodId2, String cookingFoodAmoun1, String cookingFoodAmoun2, String cdm) {
        this.cookingFoodId1 = cookingFoodId1;
        this.cookingFoodId2 = cookingFoodId2;
        this.cookingFoodAmoun1 = cookingFoodAmoun1;
        this.cookingFoodAmoun2 = cookingFoodAmoun2;
        this.cdm = cdm;
    }

    public String getCookingFoodId1() {
        return cookingFoodId1;
    }

    public void setCookingFoodId1(String cookingFoodId1) {
        this.cookingFoodId1 = cookingFoodId1;
    }

    public String getCookingFoodId2() {
        return cookingFoodId2;
    }

    public void setCookingFoodId2(String cookingFoodId2) {
        this.cookingFoodId2 = cookingFoodId2;
    }

    public String getCookingFoodAmoun1() {
        return cookingFoodAmoun1;
    }

    public void setCookingFoodAmoun1(String cookingFoodAmoun1) {
        this.cookingFoodAmoun1 = cookingFoodAmoun1;
    }

    public String getCookingFoodAmoun2() {
        return cookingFoodAmoun2;
    }

    public void setCookingFoodAmoun2(String cookingFoodAmoun2) {
        this.cookingFoodAmoun2 = cookingFoodAmoun2;
    }

    public String getCdm() {
        return cdm;
    }

    public void setCdm(String cdm) {
        this.cdm = cdm;
    }
}
