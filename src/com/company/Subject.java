package com.company;

public class Subject {
    private Integer id;
    private String name;
    private Integer semester;

    public Subject(Integer id, String name, int semester) {
        this.id = id;
        this.semester = semester;
        this.name = name;
    }

    public Subject(Integer subjectId){
        this.id = subjectId;
    }


    public Subject() {

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

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", name='" + name + '\'' + ", semester=" + semester + '}';
    }
}
