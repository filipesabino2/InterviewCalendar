package com.takehomeassignment.interviewcalendar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Availability {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String typePerson;
    private int idPerson;
    private int dayOfWeek;
    private int ini;
    private int end;

    public Availability() {
    }

    public Availability(String typePerson, int idPerson, int dayOfWeek, int ini, int end) {
        this.typePerson = typePerson;
        this.idPerson = idPerson;
        this.dayOfWeek = dayOfWeek;
        this.ini = ini;
        this.end = end;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypePerson() {
        return this.typePerson;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    public int getIdPerson() {
        return this.idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getIni() {
        return this.ini;
    }

    public void setIni(int ini) {
        this.ini = ini;
    }

    public int getEnd() {
        return this.end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
