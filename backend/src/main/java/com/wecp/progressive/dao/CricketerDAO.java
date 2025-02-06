package com.wecp.progressive.dao;
<<<<<<< HEAD
 
import com.wecp.progressive.entity.Cricketer;
import java.sql.SQLException;
import java.util.List;
 
public interface CricketerDAO {
 
    int addCricketer(Cricketer cricketer) throws SQLException;
 
    Cricketer getCricketerById(int cricketerId) throws SQLException;
 
    void updateCricketer(Cricketer cricketer) throws SQLException;
 
    void deleteCricketer(int cricketerId) throws SQLException;
 
=======

import com.wecp.progressive.entity.Cricketer;

import java.sql.SQLException;
import java.util.List;

public interface CricketerDAO {
    int addCricketer(Cricketer cricketer) throws SQLException;
    Cricketer getCricketerById(int cricketerId) throws SQLException;
    void updateCricketer (Cricketer cricketer) throws SQLException;
    void deleteCricketer (int cricketerId) throws SQLException;
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
    List<Cricketer> getAllCricketers() throws SQLException;
}