package com.zjw.springbootjavafx2.service;

import com.zjw.springbootjavafx2.pojo.entity.Condiment;

import java.util.List;

public interface CdmService {
    List<Condiment> selectAllCdm();
    boolean addCdm(Condiment condiment);
}
