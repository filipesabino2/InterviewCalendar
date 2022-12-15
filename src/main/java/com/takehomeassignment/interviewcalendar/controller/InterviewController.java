package com.takehomeassignment.interviewcalendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.takehomeassignment.interviewcalendar.model.Interview;
import com.takehomeassignment.interviewcalendar.repository.AvailabilityRepository;
import com.takehomeassignment.interviewcalendar.repository.InterviewRepository;

@RestController
public class InterviewController {
    
    @Autowired 
	private InterviewRepository interviewRepository;

    @Autowired 
	private AvailabilityRepository availabilityRepository;
    
    @GetMapping(path="/interviews")
	  public @ResponseBody Iterable<Interview> getAllInterviews() {
	      return interviewRepository.findAll();
	  }

    @PostMapping(path="/scheduleInterview")
    public @ResponseBody String scheduleInterview (@RequestParam int idInterviewer, @RequestParam int idCandidate, @RequestParam int dayOfWeek, 
        @RequestParam int hour) { 

        if (availabilityRepository.findByTypePersonAndIdPersonAndDayOfWeek("I", idInterviewer, dayOfWeek, hour).isEmpty()) {
            return "Interviewer not available.";
        }
        
        if (availabilityRepository.findByTypePersonAndIdPersonAndDayOfWeek("C", idCandidate, dayOfWeek, hour).isEmpty()) {
            return "Candidate not available.";
        }

        if (!interviewRepository.findByIdInterviewerAndDayOfWeekAndHour(idInterviewer, dayOfWeek, hour).isEmpty()) {
            return "Interviewer already has an interview scheduled.";
        }

        if (!interviewRepository.findByIdCandidateAndDayOfWeekAndHour(idCandidate, dayOfWeek, hour).isEmpty()) {
            return "Candidate already has an interview scheduled.";
        }

        Interview newInterview = new Interview(idInterviewer, idCandidate, dayOfWeek, hour);
        interviewRepository.save(newInterview);
        return "Saved";
    }
}
