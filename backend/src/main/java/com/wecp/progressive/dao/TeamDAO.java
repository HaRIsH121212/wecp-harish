package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Team;

import java.sql.SQLException;
import java.util.List;

public interface TeamDAO {
<<<<<<< HEAD
    int addTeam(Team team) throws SQLException ;
    Team getTeamById(int teamId) throws SQLException ;
    void updateTeam(Team team) throws SQLException ;
    void deleteTeam(int teamId) throws SQLException  ;
    List<Team> getAllTeams() throws SQLException ;
}
=======
    int addTeam(Team team) throws SQLException, SQLException;
    Team getTeamById(int teamId) throws SQLException;
    void updateTeam(Team team) throws SQLException;
    void deleteTeam(int teamId) throws SQLException;
    List<Team> getAllTeams() throws SQLException;
}
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
