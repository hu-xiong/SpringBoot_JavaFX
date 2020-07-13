package com.zjw.springbootjavafx2.pojo.VO;

import com.zjw.springbootjavafx2.pojo.entity.Ingredient;
import javafx.beans.property.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class IgdVO {
    private SimpleIntegerProperty igdId;

    private SimpleStringProperty igdName;

    private SimpleStringProperty igdType;

    private SimpleStringProperty igdEnterHouseTime;

    private SimpleStringProperty igdSupplier;

    private SimpleStringProperty igdDish;

    private SimpleIntegerProperty igdMaxduration;

    private SimpleStringProperty igdGrade;

    private SimpleIntegerProperty igdAmount;

    private SimpleIntegerProperty igdDuration;

    private SimpleStringProperty igdSaveMethod;

    private SimpleBooleanProperty selected;

    public IgdVO() {
    }

    public IgdVO(Ingredient ingredient){
        DateFormat tf = new SimpleDateFormat("yyyy-MM-dd");

        setIgdId(ingredient.getIgdId());
        setIgdName(ingredient.getIgdName());
        setIgdType(ingredient.getIgdType());
        setIgdSupplier(ingredient.getIgdSupplier());
        setIgdEnterHouseTime(tf.format(ingredient.getIgdEnterhousetime()).toString());
        setIgdMaxduration(ingredient.getIgdMaxduration());
        setIgdSaveMethod(ingredient.getIgdSavemethod());
    }

    public void initIngredient(Ingredient ingredient){
        DateFormat tf = new SimpleDateFormat("yyyy-MM-dd");

        setIgdId(ingredient.getIgdId());
        setIgdName(ingredient.getIgdName());
        setIgdDuration(ingredient.getIgdDuration());
        setIgdEnterHouseTime(tf.format(ingredient.getIgdEnterhousetime()).toString());
        setIgdGrade(ingredient.getIgdGrade());
        setIgdMaxduration(ingredient.getIgdMaxduration());
    }

    /**
     * setter
     * @param igdId
     */
    public void setIgdId(Integer igdId) {
        this.igdId = new SimpleIntegerProperty(igdId);
    }
    public void setIgdName(String name) {
        this.igdName = new SimpleStringProperty(name);
    }
    public void setIgdType(String type){
        this.igdType = new SimpleStringProperty(type);
    }
    public void setIgdDuration(Integer igdDuration){
        this.igdDuration = new SimpleIntegerProperty(igdDuration);
    }
    public void setIgdAmount(Integer amount){
        this.igdAmount = new SimpleIntegerProperty(amount);
    }
    public void setIgdSupplier(String s){
        this.igdSupplier = new SimpleStringProperty(s);
    }
    public void setIgdMaxduration(Integer max){
        this.igdMaxduration = new SimpleIntegerProperty(max);
    }
    public void setIgdDish(String igdDish){
        this.igdDish = new SimpleStringProperty(igdDish);
    }
    public void setIgdGrade(Integer Grade){
        if(Grade > 6){
            this.igdGrade = new SimpleStringProperty("非常新鲜");
        }else if(Grade <= 6 && Grade >4){
            this.igdGrade = new SimpleStringProperty("比较新鲜");
        }else if(Grade <= 4 && Grade >2){
            this.igdGrade = new SimpleStringProperty("一般新鲜");
        }else if(Grade <= 2 && Grade >0){
            this.igdGrade = new SimpleStringProperty("临近过期");
        }else {
            this.igdGrade = new SimpleStringProperty("已过期");
        }
    }
    public void setIgdEnterHouseTime(String time){
        this.igdEnterHouseTime = new SimpleStringProperty(time);
    }
    public void setIgdSaveMethod(String method){
        this.igdSaveMethod = new SimpleStringProperty(method);
    }
    public void setSelected(boolean selected){
        this.selected = new SimpleBooleanProperty(selected);
    }



    /**
     * getter
     * @return
     */
    public boolean isSelected() {
        return selected.get();
    }

    public SimpleBooleanProperty selectedProperty() {
        return selected;
    }

    public int getIgdId() {
        return igdId.get();
    }

    public SimpleIntegerProperty igdIdProperty() {
        return igdId;
    }

    public String getIgdName() {
        return igdName.get();
    }

    public SimpleStringProperty igdNameProperty() {
        return igdName;
    }

    public String getIgdType() {
        return igdType.get();
    }

    public SimpleStringProperty igdTypeProperty() {
        return igdType;
    }

    public String getIgdEnterHouseTime() {
        return igdEnterHouseTime.get();
    }

    public SimpleStringProperty igdEnterHouseTimeProperty() {
        return igdEnterHouseTime;
    }

    public String getIgdSupplier() {
        return igdSupplier.get();
    }

    public SimpleStringProperty igdSupplierProperty() {
        return igdSupplier;
    }

    public String getIgdDish() {
        return igdDish.get();
    }

    public SimpleStringProperty igdDishProperty() {
        return igdDish;
    }

    public int getIgdMaxduration() {
        return igdMaxduration.get();
    }

    public SimpleIntegerProperty igdMaxdurationProperty() {
        return igdMaxduration;
    }

    public String getIgdGrade() {
        return igdGrade.get();
    }

    public SimpleStringProperty igdGradeProperty() {
        return igdGrade;
    }

    public int getIgdAmount() {
        return igdAmount.get();
    }

    public SimpleIntegerProperty igdAmountProperty() {
        return igdAmount;
    }

    public int getIgdDuration() {
        return igdDuration.get();
    }

    public SimpleIntegerProperty igdDurationProperty() {
        return igdDuration;
    }
}
