package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplArraylist implements TeamService {
    private static List<Team> teamList = new ArrayList<>();

    @Override
    public int addTeam(Team team) {
        teamList.add(team);
        return teamList.size();
        
    }

    @Override
    public List<Team> getAllTeams() {
        return new ArrayList<>(teamList);
        
    }

    

    @Override
    public List<Team> getAllTeamsSortedByName() {
        List<Team> sortedList = teamList;
        sortedList.sort(Comparator.comparing(Team::getTeamName));
        return sortedList;
        
    }
    @Override
    public void emptyArrayList()
    {
        TeamService.super.emptyArrayList();
    }
    


}


