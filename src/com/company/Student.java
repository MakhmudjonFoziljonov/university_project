package com.company;

import java.time.LocalDate;

public class Student extends Employee {

    private Integer level;
    private Subject[] subjects = new Subject[3];
    private Integer subjectsIndex = 0;

    public Student(Integer id, String name, Integer age, String surname, LocalDate birthDate, Integer level) {
        super(id, name, surname, age, String.format(birthDate.toString()));
        this.level = level;
    }

    public Student() {

    }
    public void setLevel(Integer level) {
        this.level = level;
    }
    public Integer getLevel() {
        return level;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public void addSubjectToStudent(Subject subject) {
        subjects[subjectsIndex++] = subject;

    }

    public boolean isExists(Integer subjectId){
        for (Subject subject : subjects) {
            if (subject != null && subject.getId().equals(subjectId)){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", age=" + super.getAge() +
                ", birthDate=" + super.getBirthDate() +
                ", level=" + level +
                '}';
    }
}
