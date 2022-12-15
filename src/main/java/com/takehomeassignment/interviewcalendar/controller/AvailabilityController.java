package com.takehomeassignment.interviewcalendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.takehomeassignment.interviewcalendar.model.Availability;
import com.takehomeassignment.interviewcalendar.repository.AvailabilityRepository;

@RestController
public class AvailabilityController {
    
    @Autowired 
	private AvailabilityRepository availabilityRepository;

    @GetMapping(path="/checkAvailability")
	public @ResponseBody Iterable<Availability> checkAvailability(@RequestParam String typePerson, @RequestParam int idPerson) {
	    return availabilityRepository.findByTypePersonAndIdPerson(typePerson, idPerson);
	}

    @PostMapping(path="/setAvailability")
    public @ResponseBody String setAvailability (@RequestParam String typePerson, @RequestParam int idPerson, @RequestParam int dayOfWeek, @RequestParam int ini, 
        @RequestParam int end) { 
        Availability newAvailability = new Availability(typePerson, idPerson, dayOfWeek, ini, end);
        availabilityRepository.save(newAvailability);
        return "Saved";
    }

}
