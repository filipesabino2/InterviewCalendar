package com.takehomeassignment.interviewcalendar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Interview {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int idInterviewer;
    private int idCandidate;
    private int dayOfWeek;
    private int hour;

    public Interview() {
    }

    public Interview(int idInterviewer, int idCandidate, int dayOfWeek, int hour) {
        this.idInterviewer = idInterviewer;
        this.idCandidate = idCandidate;
        this.dayOfWeek = dayOfWeek;
        this.hour = hour;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInterviewer() {
        return this.idInterviewer;
    }

    public void setIdInterviewer(int idInterviewer) {
        this.idInterviewer = idInterviewer;
    }

    public int getIdCandidate() {
        return this.idCandidate;
    }

    public void setIdCandidate(int idCandidate) {
        this.idCandidate = idCandidate;
    }

    public int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

}
