package com.company;

public class Professor extends Employee{
    private Double salary;
    private Integer subjectId;

    public Professor() {
    }

    public Professor(Integer id,
                     String name,
                     String surname,
                     Integer age,
                     String birthDate,
                     Double salary,
                     Integer subjectId) {
       super(id,name,surname,age,birthDate);
        this.salary = salary;
        this.subjectId = subjectId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "Professor{" +
                " salary=" + salary +
                ", subjectId=" + subjectId +
                ", employee=" + super.toString() +
                '}';
    }
}
