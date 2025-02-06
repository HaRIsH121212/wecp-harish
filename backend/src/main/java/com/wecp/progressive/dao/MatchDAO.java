package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Match;

import java.sql.SQLException;
import java.util.List;

public interface MatchDAO {
<<<<<<< HEAD
    int addMatch(Match match) throws SQLException ;
    Match getMatchById(int matchId) throws SQLException ;
    void updateMatch(Match match) throws SQLException ;
    void deleteMatch(int matchId) throws SQLException ;
    List<Match> getAllMatches() throws SQLException ;
=======
    int addMatch(Match match) throws SQLException;
    Match getMatchById(int matchId) throws SQLException;
    void updateMatch(Match match) throws SQLException;
    void deleteMatch(int matchId) throws SQLException;
    List<Match> getAllMatches() throws SQLException;
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
}