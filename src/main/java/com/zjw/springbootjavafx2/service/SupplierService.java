package com.zjw.springbootjavafx2.service;

import com.zjw.springbootjavafx2.pojo.entity.Supplier;

import java.util.List;

public interface SupplierService {
    List<Supplier> showAll();

    boolean SupplierAdd(Supplier supplier);
}
