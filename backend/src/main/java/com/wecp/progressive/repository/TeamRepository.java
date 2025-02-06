package com.wecp.progressive.repository;
<<<<<<< HEAD

import com.wecp.progressive.entity.Team;

import java.util.Optional;

=======
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
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    Team findByTeamId(int teamId);
<<<<<<< HEAD
    Team findByTeamName(String teamName);
=======
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
}