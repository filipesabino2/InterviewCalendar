package com.takehomeassignment.interviewcalendar.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.takehomeassignment.interviewcalendar.model.Interview;

public interface InterviewRepository extends CrudRepository<Interview, Long> {

    List<Interview> findByIdInterviewerAndDayOfWeekAndHour(int idInterviewer, int dayOfWeek, int hour);

    List<Interview> findByIdCandidateAndDayOfWeekAndHour(int idCandidate, int dayOfWeek, int hour);
}