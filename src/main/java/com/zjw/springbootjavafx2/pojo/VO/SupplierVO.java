package com.zjw.springbootjavafx2.pojo.VO;

import com.zjw.springbootjavafx2.pojo.entity.Supplier;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class SupplierVO {

    private SimpleIntegerProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty number;
    private SimpleStringProperty address;
    private SimpleStringProperty plantSize;
    private SimpleIntegerProperty grade;
    private SimpleIntegerProperty firstGrade;

    /**
     * 构造器
     */
    public SupplierVO() {
    }

    public SupplierVO(Supplier supplier){
        setId(supplier.getSupplierId());
        setName(supplier.getSupplierName());
        setNumber(supplier.getSupplierPhonenumber());
        setAddress(supplier.getSupplierAddress());
        setPlantSize(supplier.getSupplierPlantsize());
        setFirstGrade(supplier.getSupplierFirstgrade());
        setGrade(supplier.getSupplierGrade());
    }

    /**
     * setter
     */
    public void setName(String name){
        this.name = new SimpleStringProperty(name);
    }
    public void setNumber(String number){
        this.number = new SimpleStringProperty(number);
    }
    public void setAddress(String address){
        this.address = new SimpleStringProperty(address);
    }
    public void setPlantSize(String plantSize){
        this.plantSize = new SimpleStringProperty(plantSize);
    }
    public void setGrade(int grade){
        this.grade = new SimpleIntegerProperty(grade);
    }
    public void setFirstGrade(int firstGrade){
        this.firstGrade = new SimpleIntegerProperty(firstGrade);
    }
    public void setId(int id){
        this.id = new SimpleIntegerProperty(id);
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

    public String getNumber() {
        return number.get();
    }

    public SimpleStringProperty numberProperty() {
        return number;
    }

    public String getAddress() {
        return address.get();
    }

    public SimpleStringProperty addressProperty() {
        return address;
    }

    public String getPlantSize() {
        return plantSize.get();
    }

    public SimpleStringProperty plantSizeProperty() {
        return plantSize;
    }

    public int getGrade() {
        return grade.get();
    }

    public SimpleIntegerProperty gradeProperty() {
        return grade;
    }

    public int getFirstGrade() {
        return firstGrade.get();
    }

    public SimpleIntegerProperty firstGradeProperty() {
        return firstGrade;
    }
}
