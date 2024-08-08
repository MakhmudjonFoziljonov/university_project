package com.company;

public class Dean extends Employee{

    private String faculty;
    private Double salary;

    public Dean(Integer id, Integer age, String name, String surname, String birthDate, String faculty, Double salary) {
        super(id,name,surname,age,birthDate);
        this.faculty = faculty;
        this.salary = salary;
    }

    public Dean() {
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Dean{" +
                "faculty='" + faculty + '\'' +
                ", salary=" + salary +
                ", employee=" + super.toString() +
                '}';
    }
}
