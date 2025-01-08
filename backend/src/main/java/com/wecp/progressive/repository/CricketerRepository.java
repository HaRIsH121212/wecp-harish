package com.wecp.progressive.repository;
<<<<<<< HEAD
 
=======

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
import com.wecp.progressive.entity.Cricketer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
<<<<<<< HEAD
 
import java.util.List;
 
@Repository
public interface CricketerRepository extends JpaRepository<Cricketer, Integer> {
 
    Cricketer findByCricketerId(int cricketerId);
 
    List<Cricketer> findByTeam_TeamId(int teamId);
     long countByTeam_TeamId(int teamId);
=======

import java.util.List;

@Repository
public interface CricketerRepository extends JpaRepository<Cricketer, Integer> {

    Cricketer findByCricketerId(int cricketerId);

    List<Cricketer> findByTeam_TeamId(int teamId);

>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
    @Modifying
    @Transactional
    @Query("DELETE FROM Cricketer c WHERE c.team.teamId = :teamId")
    void deleteByTeamId(@Param("teamId") int teamId);
}