package com.wecp.progressive.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wecp.progressive.entity.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Integer> {

    Long countByCategory(String category);

    @Modifying
    @Transactional
    @Query("DELETE FROM Vote v WHERE v.team.teamId = :teamId")
    void deleteByTeamId(@Param("teamId") int teamId);

    @Modifying
    @Transactional
    @Query("DELETE FROM Vote v WHERE v.cricketer.cricketerId = :cricketerId")
    void deleteByCricketerId(@Param("cricketerId") int cricketerId);
}
=======

public interface VoteRepository {
}
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
