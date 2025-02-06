package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Vote;
<<<<<<< HEAD
import com.wecp.progressive.service.impl.VoteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.http.ResponseEntity;
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b

import java.util.List;
import java.util.Map;

<<<<<<< HEAD
@RestController
@RequestMapping("/vote")
public class VoteController {


    private VoteServiceImpl voteServiceImpl;

    @Autowired
    public VoteController(VoteServiceImpl voteServiceImpl) {
        this.voteServiceImpl = voteServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<Vote>> getAllVotes() {
        return new ResponseEntity<>(voteServiceImpl.getAllVotes(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> createVote(@RequestBody Vote vote) {
        return new ResponseEntity<>(voteServiceImpl.createVote(vote),HttpStatus.CREATED);
=======
public class VoteController {

    public ResponseEntity<List<Vote>> getAllVotes() {
        return null;
    }

    public ResponseEntity<Integer> createVote(Vote vote) {
        return null;
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
    }

    // Each key (k) represents a category (categories - “Team”, “Batsman”, “Bowler”, “All-rounder” and “Wicketkeeper”)
    // and each value (v) represents the total number of votes for that category.
<<<<<<< HEAD
    @GetMapping("/count")
    public ResponseEntity<Map<String, Long>> getVotesCountOfAllCategories() {
        return new ResponseEntity<>(voteServiceImpl.getVotesCountOfAllCategories(), HttpStatus.OK);
=======
    public ResponseEntity<Map<String, Long>> getVotesCountOfAllCategories() {
        return null;
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
    }
}