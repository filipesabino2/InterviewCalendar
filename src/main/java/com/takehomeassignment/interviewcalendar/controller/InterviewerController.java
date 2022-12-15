package com.takehomeassignment.interviewcalendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.takehomeassignment.interviewcalendar.model.Interviewer;
import com.takehomeassignment.interviewcalendar.repository.InterviewerRepository;

@RestController
public class InterviewerController {
    
    @Autowired 
	  private InterviewerRepository interviewerRepository;
    
    @GetMapping(path="/interviewers")
	  public @ResponseBody Iterable<Interviewer> getAllInterviewers() {
	      return interviewerRepository.findAll();
	  }

    @PostMapping(path="/addInterviewer")
    public @ResponseBody String addInterviewer (@RequestParam String firstName
        , @RequestParam String lastName) { 
        Interviewer newInterviewer = new Interviewer(firstName, lastName);
        interviewerRepository.save(newInterviewer);
        return "Saved";
    }
}
