package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplJdbc implements TeamService {
    private TeamDAO teamDAO;
    
    public TeamServiceImplJdbc() {
    }

    public TeamServiceImplJdbc(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }


    

    @Override
    public List<Team> getAllTeams() {
        return List.of();
    }

    @Override
    public int addTeam(Team team) {
        return -1;
    }

    @Override
    public void deleteTeam(int teamId) {
        
        
    }

    @Override
    public void emptyArrayList() {
        
    }

    @Override
    public Team getTeamById(int teamId) {
        return null;
    }

    @Override
    public void updateTeam(Team team) {
        
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        return List.of();
    }

}