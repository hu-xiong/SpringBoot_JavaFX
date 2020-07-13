package com.zjw.springbootjavafx2.pojo.entity;

import java.io.Serializable;

/**
 * cooking
 * @author 
 */
public class CookingKey implements Serializable {
    private String cookingIgdId;

    private String cookingDishId;

    private static final long serialVersionUID = 1L;

    public String getCookingIgdId() {
        return cookingIgdId;
    }

    public void setCookingIgdId(String cookingIgdId) {
        this.cookingIgdId = cookingIgdId;
    }

    public String getCookingDishId() {
        return cookingDishId;
    }

    public void setCookingDishId(String cookingDishId) {
        this.cookingDishId = cookingDishId;
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
        CookingKey other = (CookingKey) that;
        return (this.getCookingIgdId() == null ? other.getCookingIgdId() == null : this.getCookingIgdId().equals(other.getCookingIgdId()))
            && (this.getCookingDishId() == null ? other.getCookingDishId() == null : this.getCookingDishId().equals(other.getCookingDishId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCookingIgdId() == null) ? 0 : getCookingIgdId().hashCode());
        result = prime * result + ((getCookingDishId() == null) ? 0 : getCookingDishId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cookingIgdId=").append(cookingIgdId);
        sb.append(", cookingDishId=").append(cookingDishId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}