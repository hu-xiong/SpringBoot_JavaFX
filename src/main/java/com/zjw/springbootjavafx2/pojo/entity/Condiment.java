package com.zjw.springbootjavafx2.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * condiment
 * @author 
 */
public class Condiment implements Serializable {
    private Integer cdmId;

    private String cdmName;

    private Date cdmEnterhousetime;

    private Integer cdmDuration;

    private Integer cdmMaxduration;

    private String cdmSupplier;

    private Integer cdmGrade;

    public Condiment() {
    }

    public Condiment(String cdmName, Integer cdmMaxduration, String cdmSupplier,Integer cdmGrade) {
        this.cdmName = cdmName;
        this.cdmMaxduration = cdmMaxduration;
        this.cdmSupplier = cdmSupplier;
        this.cdmGrade = cdmGrade;
    }

    private static final long serialVersionUID = 1L;

    public Integer getCdmId() {
        return cdmId;
    }

    public void setCdmId(Integer cdmId) {
        this.cdmId = cdmId;
    }

    public String getCdmName() {
        return cdmName;
    }

    public void setCdmName(String cdmName) {
        this.cdmName = cdmName;
    }

    public Date getCdmEnterhousetime() {
        return cdmEnterhousetime;
    }

    public void setCdmEnterhousetime(Date cdmEnterhousetime) {
        this.cdmEnterhousetime = cdmEnterhousetime;
    }

    public Integer getCdmDuration() {
        return cdmDuration;
    }

    public void setCdmDuration(Integer cdmDuration) {
        this.cdmDuration = cdmDuration;
    }

    public Integer getCdmMaxduration() {
        return cdmMaxduration;
    }

    public void setCdmMaxduration(Integer cdmMaxduration) {
        this.cdmMaxduration = cdmMaxduration;
    }

    public String getCdmSupplier() {
        return cdmSupplier;
    }

    public void setCdmSupplier(String cdmSupplier) {
        this.cdmSupplier = cdmSupplier;
    }

    public Integer getCdmGrade() {
        return cdmGrade;
    }

    public void setCdmGrade(Integer cdmGrade) {
        this.cdmGrade = cdmGrade;
    }
}