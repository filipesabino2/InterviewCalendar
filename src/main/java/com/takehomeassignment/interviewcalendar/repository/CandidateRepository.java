package com.takehomeassignment.interviewcalendar.repository;

import org.springframework.data.repository.CrudRepository;

import com.takehomeassignment.interviewcalendar.model.Candidate;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {

}
