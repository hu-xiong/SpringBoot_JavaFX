package com.zjw.springbootjavafx2.service.iplm;

import com.zjw.springbootjavafx2.dao.CondimentDao;
import com.zjw.springbootjavafx2.pojo.entity.Condiment;
import com.zjw.springbootjavafx2.service.CdmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CdmServiceIpm implements CdmService {

    @Resource
    CondimentDao condimentDao;

    @Override
    public List<Condiment> selectAllCdm() {
        return condimentDao.showAll();
    }

    @Override
    public boolean addCdm(Condiment condiment) {
        if(condimentDao.insertSelective(condiment) == 1){
            return true;
        }
        return false;
    }
}
