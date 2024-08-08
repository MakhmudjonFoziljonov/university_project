package com.company;

public class Exam {
    private Integer id;
    private Integer studentId;
    private Student student;
    private Integer subjectId;
    private Subject subject;
    private Integer grade;

    public Exam() {
    }

    public Exam(Integer id, Integer studentId, Student student, Integer subjectId, Subject subject, Integer grade) {
        this.id = id;
        this.studentId = studentId;
        this.student = student;
        this.subjectId = subjectId;
        this.subject = subject;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", student=" + student +
                ", subjectId=" + subjectId +
                ", subject=" + subject +
                ", grade=" + grade +
                '}';
    }
}
