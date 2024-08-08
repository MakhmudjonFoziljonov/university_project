package com.company;

import java.util.Date;

public class Event {
    private Integer id;
    private String name;
    private Integer professorId;
    private Professor professor;
    private Date date;

    public Event() {
    }

    public Event(Integer id, String name, Integer professorId, Professor professor, Date date) {
        this.id = id;
        this.name = name;
        this.professorId = professorId;
        this.professor = professor;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", professorId=" + professorId +
                ", professor=" + professor +
                ", date=" + date +
                '}';
    }
}
