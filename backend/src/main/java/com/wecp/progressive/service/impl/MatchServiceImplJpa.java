package com.wecp.progressive.service.impl;
<<<<<<< HEAD
 
import com.wecp.progressive.entity.Match;
import com.wecp.progressive.exception.NoMatchesFoundException;
=======

import com.wecp.progressive.entity.Match;
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
import com.wecp.progressive.repository.MatchRepository;
import com.wecp.progressive.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
 
import java.sql.SQLException;
import java.util.List;
 
@Service
public class MatchServiceImplJpa implements MatchService {
 
    private MatchRepository matchRepository;
 
=======

import java.sql.SQLException;
import java.util.List;

@Service
public class MatchServiceImplJpa implements MatchService {

    private MatchRepository matchRepository;

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Autowired
    public MatchServiceImplJpa(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public List<Match> getAllMatches() throws SQLException {
        return matchRepository.findAll();
    }
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public Match getMatchById(int matchId) throws SQLException {
        return matchRepository.findByMatchId(matchId);
    }
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public Integer addMatch(Match match) throws SQLException {
        return matchRepository.save(match).getMatchId();
    }
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public void updateMatch(Match match) throws SQLException {
        matchRepository.save(match);
    }
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public void deleteMatch(int matchId) throws SQLException {
        matchRepository.deleteById(matchId);
    }
<<<<<<< HEAD
 
    @Override
    public List<Match> getAllMatchesByStatus(String status) throws SQLException {
       
        List<Match> matchList = matchRepository.findAllByStatus(status);
      if(matchList.isEmpty())
      {
        throw new NoMatchesFoundException("No Matches found with status : "+status);
      }
=======

    @Override
    public List<Match> getAllMatchesByStatus(String status) throws SQLException {
        List<Match> matchList = matchRepository.findAllByStatus(status);
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
        return matchList;
    }
}