package com.zjw.springbootjavafx2.pojo.entity;

import java.io.Serializable;

/**
 * cooking
 * @author 
 */
public class Cooking extends CookingKey implements Serializable {
    private String cookingCdm;

    private String cookingIgdAmount;

    private static final long serialVersionUID = 1L;

    public String getCookingCdm() {
        return cookingCdm;
    }

    public void setCookingCdm(String cookingCdm) {
        this.cookingCdm = cookingCdm;
    }

    public String getCookingIgdAmount() {
        return cookingIgdAmount;
    }

    public void setCookingIgdAmount(String cookingIgdAmount) {
        this.cookingIgdAmount = cookingIgdAmount;
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
        Cooking other = (Cooking) that;
        return (this.getCookingIgdId() == null ? other.getCookingIgdId() == null : this.getCookingIgdId().equals(other.getCookingIgdId()))
            && (this.getCookingDishId() == null ? other.getCookingDishId() == null : this.getCookingDishId().equals(other.getCookingDishId()))
            && (this.getCookingCdm() == null ? other.getCookingCdm() == null : this.getCookingCdm().equals(other.getCookingCdm()))
            && (this.getCookingIgdAmount() == null ? other.getCookingIgdAmount() == null : this.getCookingIgdAmount().equals(other.getCookingIgdAmount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCookingIgdId() == null) ? 0 : getCookingIgdId().hashCode());
        result = prime * result + ((getCookingDishId() == null) ? 0 : getCookingDishId().hashCode());
        result = prime * result + ((getCookingCdm() == null) ? 0 : getCookingCdm().hashCode());
        result = prime * result + ((getCookingIgdAmount() == null) ? 0 : getCookingIgdAmount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cookingCdm=").append(cookingCdm);
        sb.append(", cookingIgdAmount=").append(cookingIgdAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}