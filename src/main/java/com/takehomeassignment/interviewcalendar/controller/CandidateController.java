package com.takehomeassignment.interviewcalendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.takehomeassignment.interviewcalendar.model.Candidate;
import com.takehomeassignment.interviewcalendar.repository.CandidateRepository;

@RestController
public class CandidateController {
    
    @Autowired 
  	private CandidateRepository candidateRepository;
    
    @GetMapping(path="/candidates")
  	public @ResponseBody Iterable<Candidate> getAllCandidates() {
	      return candidateRepository.findAll();
	}

    @PostMapping(path="/addCandidate")
    public @ResponseBody String addCandidate (@RequestParam String firstName
        , @RequestParam String lastName) {
      Candidate newCandidate = new Candidate(firstName, lastName);
      candidateRepository.save(newCandidate);
      return "Saved";
    }
}
