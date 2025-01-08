package com.wecp.progressive.service.impl;
<<<<<<< HEAD
 
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.exception.TeamCricketerLimitExceededException;
=======

import com.wecp.progressive.entity.Cricketer;
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
import com.wecp.progressive.repository.CricketerRepository;
import com.wecp.progressive.service.CricketerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
 
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
 
@Service
public class CricketerServiceImplJpa implements CricketerService {
 
    private CricketerRepository cricketerRepository;
 
=======

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

@Service
public class CricketerServiceImplJpa implements CricketerService {

    private CricketerRepository cricketerRepository;

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Autowired
    public CricketerServiceImplJpa(CricketerRepository cricketerRepository) {
        this.cricketerRepository = cricketerRepository;
    }
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public List<Cricketer> getAllCricketers() throws SQLException {
        return cricketerRepository.findAll();
    }
<<<<<<< HEAD
 
    @Override
    public Integer addCricketer(Cricketer cricketer) throws SQLException {
       if(cricketerRepository.countByTeam_TeamId(cricketer.getTeam().getTeamId())>11)
       {
        throw new TeamCricketerLimitExceededException("reached max players");
       }
        return cricketerRepository.save(cricketer).getCricketerId();
    }
 
=======

    @Override
    public Integer addCricketer(Cricketer cricketer) throws SQLException {
        return cricketerRepository.save(cricketer).getCricketerId();
    }

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException {
        List<Cricketer> sortedCricketer = cricketerRepository.findAll();
        sortedCricketer.sort(Comparator.comparing(Cricketer::getExperience));
        return sortedCricketer;
    }
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public void updateCricketer(Cricketer cricketer) throws SQLException {
        cricketerRepository.save(cricketer);
    }
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public void deleteCricketer(int cricketerId) throws SQLException {
        cricketerRepository.deleteById(cricketerId);
    }
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public Cricketer getCricketerById(int cricketerId) throws SQLException {
        return cricketerRepository.findByCricketerId(cricketerId);
    }
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public List<Cricketer> getCricketersByTeam(int teamId) throws SQLException {
        return cricketerRepository.findByTeam_TeamId(teamId);
    }
<<<<<<< HEAD
}
 
=======
}
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
