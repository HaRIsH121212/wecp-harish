package com.wecp.progressive.repository;
<<<<<<< HEAD
 
import com.wecp.progressive.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
 
    Team findByTeamId(int teamId);
    Team findByTeamName(String teamName);
=======

import com.wecp.progressive.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    Team findByTeamId(int teamId);
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
}