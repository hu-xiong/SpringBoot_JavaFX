package com.zjw.springbootjavafx2.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ingredient
 * @author 
 */
public class Ingredient implements Serializable {
    private Integer igdId;

    private String igdName;

    private String igdType;

    private Date igdEnterhousetime;

    private Integer igdDuration;

    private String igdAmount;

    private String igdSupplier;

    private Integer igdMaxduration;

    private Integer igdGrade;

    private String igdSavemethod;

    public  Ingredient(String igdName, String igdType, String igdAmount, String igdSupplier, Integer igdMaxduration, String igdSavemethod) {
        this.igdName = igdName;
        this.igdType = igdType;
        this.igdAmount = igdAmount;
        this.igdSupplier = igdSupplier;
        this.igdMaxduration = igdMaxduration;
        this.igdSavemethod = igdSavemethod;
    }

    public Ingredient() {
    }

    private static final long serialVersionUID = 1L;

    public Integer getIgdId() {
        return igdId;
    }

    public void setIgdId(Integer igdId) {
        this.igdId = igdId;
    }

    public String getIgdName() {
        return igdName;
    }

    public void setIgdName(String igdName) {
        this.igdName = igdName;
    }

    public String getIgdType() {
        return igdType;
    }

    public void setIgdType(String igdType) {
        this.igdType = igdType;
    }

    public Date getIgdEnterhousetime() {
        return igdEnterhousetime;
    }

    public void setIgdEnterhousetime(Date igdEnterhousetime) {
        this.igdEnterhousetime = igdEnterhousetime;
    }

    public Integer getIgdDuration() {
        return igdDuration;
    }

    public void setIgdDuration(Integer igdDuration) {
        this.igdDuration = igdDuration;
    }

    public String getIgdAmount() {
        return igdAmount;
    }

    public void setIgdAmount(String igdAmount) {
        this.igdAmount = igdAmount;
    }

    public String getIgdSupplier() {
        return igdSupplier;
    }

    public void setIgdSupplier(String igdSupplier) {
        this.igdSupplier = igdSupplier;
    }

    public Integer getIgdMaxduration() {
        return igdMaxduration;
    }

    public void setIgdMaxduration(Integer igdMaxduration) {
        this.igdMaxduration = igdMaxduration;
    }

    public Integer getIgdGrade() {
        return igdGrade;
    }

    public void setIgdGrade(Integer igdGrade) {
        this.igdGrade = igdGrade;
    }

    public String getIgdSavemethod() {
        return igdSavemethod;
    }

    public void setIgdSavemethod(String igdSavemethod) {
        this.igdSavemethod = igdSavemethod;
    }
}