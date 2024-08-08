package com.company;

public class Security extends Employee {

    Double salary;
    String militaryRank;

    public Security(Integer id, String name, String surname, Integer age, String birthDate, Double salary, String militaryRank) {
        super(id, name, surname, age, birthDate);
        this.salary = salary;
        this.militaryRank = militaryRank;
    }

    public Security() {
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(String militaryRank) {
        this.militaryRank = militaryRank;
    }

    @Override
    public String toString() {
        return "Security{" +
                "salary=" + salary +
                ", militaryRank='" + militaryRank + '\'' +
                ", employee='" + super.toString() + '\'' +
                '}';
    }
}
