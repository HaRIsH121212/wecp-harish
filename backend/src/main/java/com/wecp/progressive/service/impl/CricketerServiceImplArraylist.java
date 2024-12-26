package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.CricketerDAO;
import com.wecp.progressive.entity.Cricketer;

public class CricketerServiceImplArraylist implements CricketerDAO {

    @Override
    public int addCricketer(Cricketer cricketer) {
        return -1;
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) {
        return null;
    }

    @Override
    public void updateCricketer(Cricketer cricketer) {
        
    }

    @Override
    public void deleteCricketer(int cricketerId) {
        
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        return List.of();
    }


}