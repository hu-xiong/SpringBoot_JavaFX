package com.zjw.springbootjavafx2.pojo.VO;

import com.zjw.springbootjavafx2.pojo.entity.Dish;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class DishVO {
    private SimpleStringProperty name;
    private SimpleStringProperty type;
    private SimpleIntegerProperty firstFood;
    private SimpleStringProperty firstFoodName;
    private SimpleStringProperty firstFoodAmount;
    private SimpleIntegerProperty secondFood;
    private SimpleStringProperty secondFoodName;
    private SimpleStringProperty secondFoodAmount;
    private SimpleIntegerProperty cdm;
    private SimpleStringProperty cdmName;
    private SimpleIntegerProperty grade;
    private SimpleIntegerProperty difficulty;

    public DishVO() {
    }

    public DishVO(Dish dish) {
        setName(dish.getDishName());
        setType(dish.getDishType());
        setFirstFood(dish.getDishFirstfoodid());
        setFirstFoodName(dish.getDishFirstname());
        setFirstFoodAmount(dish.getDishFirstamount());
        setSecondFood(dish.getDishSecondfoodid());
        setSecondFoodName(dish.getDishSecondname());
        setSecondFoodAmount(dish.getDishSecondamount());
        setGrade(dish.getDishGrade());
        setDifficulty(dish.getDishDificulty());
        setCdm(dish.getDishCdmid());
        setCdmName(dish.getDishName());
    }

    /**
     * setter
     */
    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }
    public void setType(String type){
        this.type = new SimpleStringProperty(type);
    }
    public void setFirstFood(Integer firstFood){
        this.firstFood = new SimpleIntegerProperty(firstFood);
    }
    public void setFirstFoodName(String firstFoodName){
        this.firstFoodName = new SimpleStringProperty(firstFoodName);
    }
    public void setFirstFoodAmount(String firstFoodAmount){
        this.firstFoodAmount = new SimpleStringProperty(firstFoodAmount);
    }
    public void setSecondFood(Integer firstFood){
        this.secondFood = new SimpleIntegerProperty(firstFood);
    }
    public void setSecondFoodName(String firstFoodName){
        this.secondFoodName = new SimpleStringProperty(firstFoodName);
    }
    public void setSecondFoodAmount(String firstFoodAmount){
        this.secondFoodAmount = new SimpleStringProperty(firstFoodAmount);
    }
    public void setGrade(Integer grade){
        this.grade = new SimpleIntegerProperty(grade);
    }
    public void setDifficulty(Integer difficulty){
        this.difficulty = new SimpleIntegerProperty(difficulty);
    }
    public void setCdm(Integer cdm){
        this.cdm = new SimpleIntegerProperty(cdm);
    }
    public void setCdmName(String cdmName){
        this.cdmName = new SimpleStringProperty(cdmName);
    }


    /**
     * getter
     */
    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public int getFirstFood() {
        return firstFood.get();
    }

    public SimpleIntegerProperty firstFoodProperty() {
        return firstFood;
    }

    public String getFirstFoodName() {
        return firstFoodName.get();
    }

    public SimpleStringProperty firstFoodNameProperty() {
        return firstFoodName;
    }

    public String getFirstFoodAmount() {
        return firstFoodAmount.get();
    }

    public SimpleStringProperty firstFoodAmountProperty() {
        return firstFoodAmount;
    }

    public int getSecondFood() {
        return secondFood.get();
    }

    public SimpleIntegerProperty secondFoodProperty() {
        return secondFood;
    }

    public String getSecondFoodName() {
        return secondFoodName.get();
    }

    public SimpleStringProperty secondFoodNameProperty() {
        return secondFoodName;
    }

    public String getSecondFoodAmount() {
        return secondFoodAmount.get();
    }

    public SimpleStringProperty secondFoodAmountProperty() {
        return secondFoodAmount;
    }

    public int getCdm() {
        return cdm.get();
    }

    public SimpleIntegerProperty cdmProperty() {
        return cdm;
    }

    public String getCdmName() {
        return cdmName.get();
    }

    public SimpleStringProperty cdmNameProperty() {
        return cdmName;
    }

    public int getGrade() {
        return grade.get();
    }

    public SimpleIntegerProperty gradeProperty() {
        return grade;
    }

    public int getDifficulty() {
        return difficulty.get();
    }

    public SimpleIntegerProperty difficultyProperty() {
        return difficulty;
    }
}
