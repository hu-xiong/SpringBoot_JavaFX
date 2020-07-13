package com.zjw.springbootjavafx2.pojo.VO;

import com.zjw.springbootjavafx2.pojo.entity.Condiment;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CdmVO {

    private SimpleStringProperty name;
    private SimpleStringProperty supplier;
    private SimpleStringProperty enterTime;
    private SimpleIntegerProperty duration;
    private SimpleIntegerProperty maxDuration;
    private SimpleIntegerProperty grade;

    public CdmVO() {
    }

    public CdmVO(Condiment condiment){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

        setName(condiment.getCdmName());
        setSupplier(condiment.getCdmSupplier());
        setEnterTime( dateFormat.format(condiment.getCdmEnterhousetime()).toString()  );
        setDuration(condiment.getCdmDuration());
        setMaxDuration(condiment.getCdmMaxduration());
        setGrade(condiment.getCdmGrade());
    }
    /**
     * setter
     */
    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }
    public void setSupplier(String name) {
        this.supplier = new SimpleStringProperty(name);
    }
    public void setEnterTime(String name) {
        this.enterTime = new SimpleStringProperty(name);
    }
    public void setDuration(Integer duration){
        this.duration = new SimpleIntegerProperty(duration);
    }
    public void setMaxDuration(Integer maxDuration){
        this.maxDuration = new SimpleIntegerProperty(maxDuration);
    }
    public void setGrade(Integer grade){
        this.grade = new SimpleIntegerProperty(grade);
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

    public String getSupplier() {
        return supplier.get();
    }

    public SimpleStringProperty supplierProperty() {
        return supplier;
    }

    public String getEnterTime() {
        return enterTime.get();
    }

    public SimpleStringProperty enterTimeProperty() {
        return enterTime;
    }

    public int getDuration() {
        return duration.get();
    }

    public SimpleIntegerProperty durationProperty() {
        return duration;
    }

    public int getMaxDuration() {
        return maxDuration.get();
    }

    public SimpleIntegerProperty maxDurationProperty() {
        return maxDuration;
    }

    public int getGrade() {
        return grade.get();
    }

    public SimpleIntegerProperty gradeProperty() {
        return grade;
    }
}
