package com.takehomeassignment.interviewcalendar.repository;

import org.springframework.data.repository.CrudRepository;

import com.takehomeassignment.interviewcalendar.model.Interviewer;

public interface InterviewerRepository extends CrudRepository<Interviewer, Long> {

}
