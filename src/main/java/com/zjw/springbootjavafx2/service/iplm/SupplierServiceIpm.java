package com.zjw.springbootjavafx2.service.iplm;

import com.zjw.springbootjavafx2.dao.SupplierDao;
import com.zjw.springbootjavafx2.pojo.entity.Supplier;
import com.zjw.springbootjavafx2.service.SupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SupplierServiceIpm implements SupplierService {

    @Resource
    SupplierDao supplierDao;


    @Override
    public List<Supplier> showAll() {
        return supplierDao.selectAll();
    }

    @Override
    public boolean SupplierAdd(Supplier supplier) {
        int i = supplierDao.insertSelective(supplier);
        if(i == 1){
            return true;
        }
        return false;
    }
}
