package com.wecp.progressive.service;
<<<<<<< HEAD
import com.wecp.progressive.entity.Match;
import com.wecp.progressive.exception.NoMatchesFoundException;

import java.sql.SQLException;
import java.util.List;
public interface MatchService {
    List<Match> getAllMatches() throws SQLException;
    Match getMatchById(int matchId) throws SQLException;
    Integer addMatch(Match match) throws SQLException;
    void updateMatch(Match match) throws SQLException;
    void deleteMatch(int matchId) throws SQLException;
    //Do not implement these methods in MatchServiceImplJdbc.java class
    default List<Match> getAllMatchesByStatus(String status) throws SQLException{
        return null;
    }
}
=======

import com.wecp.progressive.entity.Match;

import java.sql.SQLException;
import java.util.List;

public interface MatchService {

    List<Match> getAllMatches() throws SQLException;

    Match getMatchById(int matchId) throws SQLException;

    Integer addMatch(Match match) throws SQLException;

    void updateMatch(Match match) throws SQLException;

    void deleteMatch(int matchId) throws SQLException;

    //Do not implement these methods in MatchServiceImplJdbc.java class
<<<<<<< HEAD
    default List<Match> getAllMatchesByStatus(String status)  throws SQLException {
=======
    default List<Match> getAllMatchesByStatus(String status) throws SQLException {
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
        return null;
    }
}
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
