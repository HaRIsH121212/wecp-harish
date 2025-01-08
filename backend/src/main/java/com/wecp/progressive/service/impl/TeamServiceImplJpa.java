package com.wecp.progressive.service.impl;
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.exception.TeamAlreadyExistsException;
import com.wecp.progressive.exception.TeamDoesNotExistException;
import com.wecp.progressive.repository.CricketerRepository;
import com.wecp.progressive.repository.MatchRepository;
import com.wecp.progressive.repository.TeamRepository;
import com.wecp.progressive.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
<<<<<<< HEAD
 
@Service
public class TeamServiceImplJpa  implements TeamService {
 
    private TeamRepository teamRepository;
 
    @Autowired
    CricketerRepository cricketerRepository;
 
    @Autowired
    MatchRepository matchRepository;
 
=======

@Service
public class TeamServiceImplJpa  implements TeamService {

    private TeamRepository teamRepository;

    @Autowired
    CricketerRepository cricketerRepository;

    @Autowired
    MatchRepository matchRepository;

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Autowired
    public TeamServiceImplJpa(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public List<Team> getAllTeams() throws SQLException {
        return teamRepository.findAll();
    }
<<<<<<< HEAD
 
    @Override
    public int addTeam(Team team) throws SQLException {
       if(teamRepository.existsById(team.getTeamId())){
        throw new TeamAlreadyExistsException("Team already exists.");
       }
        return teamRepository.save(team).getTeamId();
    }
 
=======

    @Override
    public int addTeam(Team team) throws SQLException {
        return teamRepository.save(team).getTeamId();
    }

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public List<Team> getAllTeamsSortedByName() throws SQLException {
        List<Team> sortedTeam = teamRepository.findAll();
        sortedTeam.sort(Comparator.comparing(Team::getTeamName));
        return sortedTeam;
    }
<<<<<<< HEAD
 
    @Override
    public Team getTeamById(int teamId) throws SQLException {
        return teamRepository.findById(teamId).orElseThrow(()-> new TeamDoesNotExistException("Team doenot exists"));
    }
 
    @Override
    public void updateTeam(Team team) throws SQLException {
     Team tm=  teamRepository.findByTeamName(team.getTeamName());
     if(tm != null)
     {
        throw new TeamAlreadyExistsException("Team already exists.");
     }  
     teamRepository.save(team);
    }
 
=======

    @Override
    public Team getTeamById(int teamId) throws SQLException {
        return teamRepository.findByTeamId(teamId);
    }

    @Override
    public void updateTeam(Team team) throws SQLException {
        teamRepository.save(team);
    }

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Override
    public void deleteTeam(int teamId) throws SQLException {
        matchRepository.deleteByTeamId(teamId);
        cricketerRepository.deleteByTeamId(teamId);
        teamRepository.deleteById(teamId);
    }
}