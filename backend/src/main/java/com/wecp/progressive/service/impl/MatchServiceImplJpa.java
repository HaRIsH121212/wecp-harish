package com.wecp.progressive.service.impl;
<<<<<<< HEAD

import com.wecp.progressive.entity.Match;
import com.wecp.progressive.exception.NoMatchesFoundException;
import com.wecp.progressive.repository.MatchRepository;
import com.wecp.progressive.repository.TicketBookingRepository;
import com.wecp.progressive.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
=======
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
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b

import java.sql.SQLException;
import java.util.List;

@Service
public class MatchServiceImplJpa implements MatchService {

    private MatchRepository matchRepository;

<<<<<<< HEAD
    @Autowired
    private TicketBookingRepository ticketBookingRepository;

=======
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
    @Autowired
    public MatchServiceImplJpa(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
    @Override
    public List<Match> getAllMatches() throws SQLException {
        return matchRepository.findAll();
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
    @Override
    public Match getMatchById(int matchId) throws SQLException {
        return matchRepository.findByMatchId(matchId);
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
    @Override
    public Integer addMatch(Match match) throws SQLException {
        return matchRepository.save(match).getMatchId();
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
    @Override
    public void updateMatch(Match match) throws SQLException {
        matchRepository.save(match);
    }
<<<<<<< HEAD

    @Override
    public void deleteMatch(int matchId) throws SQLException {
        // ticketBookingRepository.deleteByMatchId(matchId);
        matchRepository.deleteById(matchId);
    }

    @Override
    public List<Match> getAllMatchesByStatus(String status) throws SQLException {
        if(matchRepository.findAll().isEmpty())
        {
            throw new NoMatchesFoundException("no match found");
        }
        List<Match> matchList = matchRepository.findAllByStatus(status);
=======
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
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
        return matchList;
    }
}