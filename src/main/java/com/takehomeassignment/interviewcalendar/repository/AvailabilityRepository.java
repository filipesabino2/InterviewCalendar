package com.takehomeassignment.interviewcalendar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.takehomeassignment.interviewcalendar.model.Availability;

public interface AvailabilityRepository extends CrudRepository<Availability, Long> {

    List<Availability> findByTypePersonAndIdPerson(String typePerson, int idPerson);

    List<Availability> findByTypePersonAndIdPersonAndDayOfWeekAndIniGreaterThanEqualAndEndLessThanEqual(String typePerson, int idPerson, int dayOfWeek, int ini, int end);

    @Query(value = "SELECT * FROM availability WHERE type_person = ?1 AND id_person = ?2 AND day_of_week = ?3 AND ini <= ?4 AND end > ?4", nativeQuery = true)
    List<Availability> findByTypePersonAndIdPersonAndDayOfWeek(String typePerson, int idPerson, int dayOfWeek, int ini);  

}