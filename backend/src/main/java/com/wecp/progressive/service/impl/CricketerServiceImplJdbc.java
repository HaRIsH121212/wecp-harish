package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.CricketerDAO;
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplJdbc implements CricketerService {
    private CricketerDAO cricketerDAO;
    
    public CricketerServiceImplJdbc() {
    }

    public CricketerServiceImplJdbc(CricketerDAO cricketerDAO) {
        this.cricketerDAO = cricketerDAO;
    }
    
    @Override
    public List<Cricketer> getAllCricketers() {
        return List.of();
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) {
        return -1;
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        return List.of();
    }

    @Override
    public void deleteCricketer(int cricketerId) {
        
    }

    @Override
    public void emptyArrayList() {
        
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) {
        return null;
    }

    @Override
    public List<Cricketer> getCricketersByTeam(int teamId) {
        return List.of();
    }

    @Override
    public void updateCricketer(Cricketer cricketer) {
        
    }
    

}