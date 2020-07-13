package com.zjw.springbootjavafx2.pojo.entity;

import java.io.Serializable;

/**
 * supplier
 * @author 
 */
public class Supplier implements Serializable {
    private Integer supplierId;

    private String supplierName;

    private String supplierPhonenumber;

    private Integer supplierGrade;

    private Integer supplierFirstgrade;

    private String supplierAddress;

    private String supplierPlantsize;

    private static final long serialVersionUID = 1L;


    public Supplier() {
    }

    public Supplier( String supplierName, String supplierPhonenumber, Integer supplierGrade, Integer supplierFirstgrade, String supplierAddress, String supplierPlantsize) {
        this.supplierName = supplierName;
        this.supplierPhonenumber = supplierPhonenumber;
        this.supplierGrade = supplierGrade;
        this.supplierFirstgrade = supplierFirstgrade;
        this.supplierAddress = supplierAddress;
        this.supplierPlantsize = supplierPlantsize;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierPhonenumber() {
        return supplierPhonenumber;
    }

    public void setSupplierPhonenumber(String supplierPhonenumber) {
        this.supplierPhonenumber = supplierPhonenumber;
    }

    public Integer getSupplierGrade() {
        return supplierGrade;
    }

    public void setSupplierGrade(Integer supplierGrade) {
        this.supplierGrade = supplierGrade;
    }

    public Integer getSupplierFirstgrade() {
        return supplierFirstgrade;
    }

    public void setSupplierFirstgrade(Integer supplierFirstgrade) {
        this.supplierFirstgrade = supplierFirstgrade;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierPlantsize() {
        return supplierPlantsize;
    }

    public void setSupplierPlantsize(String supplierPlantsize) {
        this.supplierPlantsize = supplierPlantsize;
    }
}