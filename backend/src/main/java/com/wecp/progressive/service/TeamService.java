package com.wecp.progressive.service;

import com.wecp.progressive.entity.Team;
<<<<<<< HEAD
import com.wecp.progressive.exception.TeamAlreadyExistsException;
=======
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b

import java.sql.SQLException;
import java.util.List;

public interface TeamService {

    List<Team> getAllTeams() throws SQLException;

    int addTeam(Team team) throws SQLException;

    List<Team> getAllTeamsSortedByName() throws SQLException;

    default void emptyArrayList() {
    }

    //Do not implement these methods in TeamServiceImplArrayList.java class
    default Team getTeamById(int teamId) throws SQLException {
        return null;
    }

    default void updateTeam(Team team) throws SQLException {}

    default void deleteTeam(int teamId) throws SQLException {}

<<<<<<< HEAD
}
=======
}
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
