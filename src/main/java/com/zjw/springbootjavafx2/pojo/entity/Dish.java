package com.zjw.springbootjavafx2.pojo.entity;

import java.io.Serializable;

/**
 * dish
 * @author 
 */
public class Dish implements Serializable {
    private String dishName;

    private String dishType;

    private Integer dishGrade;

    private Integer dishDificulty;

    private Integer dishFirstfoodid;

    private String dishFirstname;

    private String dishFirstamount;

    private Integer dishSecondfoodid;

    private String dishSecondamount;

    private String dishSecondname;

    private Integer dishCdmid;

    private String dishCdmname;

    private static final long serialVersionUID = 1L;

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    public Integer getDishGrade() {
        return dishGrade;
    }

    public void setDishGrade(Integer dishGrade) {
        this.dishGrade = dishGrade;
    }

    public Integer getDishDificulty() {
        return dishDificulty;
    }

    public void setDishDificulty(Integer dishDificulty) {
        this.dishDificulty = dishDificulty;
    }

    public Integer getDishFirstfoodid() {
        return dishFirstfoodid;
    }

    public void setDishFirstfoodid(Integer dishFirstfoodid) {
        this.dishFirstfoodid = dishFirstfoodid;
    }

    public String getDishFirstname() {
        return dishFirstname;
    }

    public void setDishFirstname(String dishFirstname) {
        this.dishFirstname = dishFirstname;
    }

    public String getDishFirstamount() {
        return dishFirstamount;
    }

    public void setDishFirstamount(String dishFirstamount) {
        this.dishFirstamount = dishFirstamount;
    }

    public Integer getDishSecondfoodid() {
        return dishSecondfoodid;
    }

    public void setDishSecondfoodid(Integer dishSecondfoodid) {
        this.dishSecondfoodid = dishSecondfoodid;
    }

    public String getDishSecondamount() {
        return dishSecondamount;
    }

    public void setDishSecondamount(String dishSecondamount) {
        this.dishSecondamount = dishSecondamount;
    }

    public String getDishSecondname() {
        return dishSecondname;
    }

    public void setDishSecondname(String dishSecondname) {
        this.dishSecondname = dishSecondname;
    }

    public Integer getDishCdmid() {
        return dishCdmid;
    }

    public void setDishCdmid(Integer dishCdmid) {
        this.dishCdmid = dishCdmid;
    }

    public String getDishCdmname() {
        return dishCdmname;
    }

    public void setDishCdmname(String dishCdmname) {
        this.dishCdmname = dishCdmname;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Dish other = (Dish) that;
        return (this.getDishName() == null ? other.getDishName() == null : this.getDishName().equals(other.getDishName()))
            && (this.getDishType() == null ? other.getDishType() == null : this.getDishType().equals(other.getDishType()))
            && (this.getDishGrade() == null ? other.getDishGrade() == null : this.getDishGrade().equals(other.getDishGrade()))
            && (this.getDishDificulty() == null ? other.getDishDificulty() == null : this.getDishDificulty().equals(other.getDishDificulty()))
            && (this.getDishFirstfoodid() == null ? other.getDishFirstfoodid() == null : this.getDishFirstfoodid().equals(other.getDishFirstfoodid()))
            && (this.getDishFirstname() == null ? other.getDishFirstname() == null : this.getDishFirstname().equals(other.getDishFirstname()))
            && (this.getDishFirstamount() == null ? other.getDishFirstamount() == null : this.getDishFirstamount().equals(other.getDishFirstamount()))
            && (this.getDishSecondfoodid() == null ? other.getDishSecondfoodid() == null : this.getDishSecondfoodid().equals(other.getDishSecondfoodid()))
            && (this.getDishSecondamount() == null ? other.getDishSecondamount() == null : this.getDishSecondamount().equals(other.getDishSecondamount()))
            && (this.getDishSecondname() == null ? other.getDishSecondname() == null : this.getDishSecondname().equals(other.getDishSecondname()))
            && (this.getDishCdmid() == null ? other.getDishCdmid() == null : this.getDishCdmid().equals(other.getDishCdmid()))
            && (this.getDishCdmname() == null ? other.getDishCdmname() == null : this.getDishCdmname().equals(other.getDishCdmname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDishName() == null) ? 0 : getDishName().hashCode());
        result = prime * result + ((getDishType() == null) ? 0 : getDishType().hashCode());
        result = prime * result + ((getDishGrade() == null) ? 0 : getDishGrade().hashCode());
        result = prime * result + ((getDishDificulty() == null) ? 0 : getDishDificulty().hashCode());
        result = prime * result + ((getDishFirstfoodid() == null) ? 0 : getDishFirstfoodid().hashCode());
        result = prime * result + ((getDishFirstname() == null) ? 0 : getDishFirstname().hashCode());
        result = prime * result + ((getDishFirstamount() == null) ? 0 : getDishFirstamount().hashCode());
        result = prime * result + ((getDishSecondfoodid() == null) ? 0 : getDishSecondfoodid().hashCode());
        result = prime * result + ((getDishSecondamount() == null) ? 0 : getDishSecondamount().hashCode());
        result = prime * result + ((getDishSecondname() == null) ? 0 : getDishSecondname().hashCode());
        result = prime * result + ((getDishCdmid() == null) ? 0 : getDishCdmid().hashCode());
        result = prime * result + ((getDishCdmname() == null) ? 0 : getDishCdmname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dishName=").append(dishName);
        sb.append(", dishType=").append(dishType);
        sb.append(", dishGrade=").append(dishGrade);
        sb.append(", dishDificulty=").append(dishDificulty);
        sb.append(", dishFirstfoodid=").append(dishFirstfoodid);
        sb.append(", dishFirstname=").append(dishFirstname);
        sb.append(", dishFirstamount=").append(dishFirstamount);
        sb.append(", dishSecondfoodid=").append(dishSecondfoodid);
        sb.append(", dishSecondamount=").append(dishSecondamount);
        sb.append(", dishSecondname=").append(dishSecondname);
        sb.append(", dishCdmid=").append(dishCdmid);
        sb.append(", dishCdmname=").append(dishCdmname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}