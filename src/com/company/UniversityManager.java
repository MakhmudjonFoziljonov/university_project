package com.company;

import java.time.LocalDate;
import java.util.Date;

public class UniversityManager {
    private int generalId = 1;

    private Subject[] subjectsArray = new Subject[3];
    private int subjectIndex = 0;

    private Dean[] deansArray = new Dean[3];
    private int deanIndex = 0;

    private Security[] securitiesArray = new Security[3];
    private int securityIndex = 0;

    private Student[] studentsArray = new Student[3];
    private int studentIndex = 0;


    private Professor[] professors = new Professor[3];
    private int professorIndex = 0;

    private Exam[] exams = new Exam[3];
    private int examsIndex = 0;

    private Event[] events = new Event[3];

    private int eventIndex = 0;

    private String name;

    public UniversityManager(String name) {
        this.name = name;
    }

    public UniversityManager() {
    }

    public String getUniversityName() {
        return this.name;
    }

    /**
     * Subject
     */
    public Subject createSubject(String name, int semester) {
        for (Subject subject : subjectsArray) {
            if (subject != null && subject.getName().equals(name)) {
                return null;
            }
        }
        Subject subject = new Subject(generalId++, name, semester);
        subjectsArray[subjectIndex++] = subject;
        return subject;
    }

    public Subject getSubjectById(int id) {
        for (Subject subject : subjectsArray) {
            if (subject != null && subject.getId() == id) {
                return subject;
            }
        }
        return null;
    }

    public Subject getSubjectByName(String name) {
        for (Subject subject : subjectsArray) {
            if (subject != null && subject.getName().equals(name)) {
                return subject;
            }
        }
        return null;
    }

    /**
     * Dean
     */
    public Dean createDean(String name, String surname, Integer age, String birthDate, String faculty, Double salary) {
        for (Dean dean : deansArray) {
            if (dean != null && dean.getFaculty().equals(faculty) && dean.getName().equals(name)) {
                return null;
            }
        }
        Dean dean = new Dean(generalId++, age, name, surname, birthDate, faculty, salary);
        deansArray[deanIndex++] = dean;
        return dean;
    }

    public Dean getDeanById(Integer id) {
        for (Dean dean : deansArray) {
            if (dean != null && dean.getId() == id) {
                return dean;
            }
        }
        return null;
    }

    public String getDeanEmployedDateById(Integer id) {
        for (Dean dean : deansArray) {
            if (dean != null && dean.getId() == id) {
                return dean.getBirthDate();
            }
        }
        return null;
    }

    public Dean getDeanByFaculty(String faculty) {
        for (Dean dean : deansArray) {
            if (dean != null && dean.getFaculty().equals(faculty)) {
                return dean;
            }
        }
        return null;
    }


    /**
     * Security
     */
    public Security createSecurity(String name, String surname, Integer age, String birthDate, Double salary, String militaryRank) {
        for (Security security : securitiesArray) {
            if (security != null && security.getName().equals(name)) {
                return null;
            }
        }

        Security security = new Security(generalId++, name, surname, age, birthDate, salary, militaryRank);
        securitiesArray[securityIndex++] = security;
        return security;
    }

    public Security[] getSecurityListByMilitaryRank(String militaryRank) {
        Security[] securitiesArray2 = new Security[3];

        int index = 0;
        for (Security security : securitiesArray) {
            if (security != null && security.getMilitaryRank().equalsIgnoreCase(militaryRank)) {
                securitiesArray2[index++] = security;
            }
        }


        return securitiesArray2;
    }

    /**
     * Professor
     */
    public Professor createProfessor(String name,
                                     String surname,
                                     Integer age,
                                     String birthDate,
                                     Integer subjectId,
                                     Double salary) {
        Subject subject = getSubjectById(subjectId);
        if (subject == null) {
            return null;
        }
        Professor professor = new Professor(generalId++, name, surname, age, birthDate, salary, subjectId);
        professors[professorIndex++] = professor;
        return professor;
    }

    public Professor getProfessorById(Integer id) {
        for (Professor professor : professors) {
            if (professor != null && professor.getId().equals(id)) {
                return professor;
            }
        }
        return null;
    }

    public Professor getProfessorByNameAndBySurname(String name, String surname) {
        for (Professor professor : professors) {
            if (professor != null && professor.getName().equalsIgnoreCase(name) && professor.getSurname().equalsIgnoreCase(surname)) {
                return professor;
            }
        }
        return null;
    }

    public Professor[] getProfessorListBySubjectId(Integer subjectId) {
        int index = 0;
        int count = 0;
        for (Professor professor : professors) {
            if (professor != null && professor.getSubjectId().equals(subjectId)) {
                count++;
            }
        }
        Professor[] newProfessor = new Professor[count];
        for (Professor professor : professors) {
            if (professor != null && professor.getSubjectId().equals(subjectId)) {
                newProfessor[index++] = professor;
            }
        }
        return newProfessor;
    }

    /**
     * Student
     */
    public Student createStudent(String name, String surname, Integer age, LocalDate birthDate, Integer level) {

        Student student = new Student(
                generalId++,
                name,
                age,
                surname,
                birthDate,
                level);

        studentsArray[studentIndex++] = student;

        return student;
    }

    public Student getStudentById(Integer id) {
        for (Student student : studentsArray) {
            if (student != null && student.getId().equals(id)) {
                return student;
            }
        }

        return null;
    }

    public Student[] getStudentListByLevel(Integer level) {
        int count = 0;
        int index = 0;
        for (Student student : studentsArray) {
            if (student != null && student.getLevel().equals(level)) {
                count++;
            }
        }

        Student[] newStudent = new Student[count];


        for (Student student : studentsArray) {
            if (student != null && student.getLevel().equals(level)) {
                newStudent[index++] = student;
            }
        }
        return newStudent;
    }

    public Student addSubjectToStudent(Integer studentId, Integer subjectId) {
        Student student = getStudentById(studentId);
        Subject subject = getSubjectById(subjectId);
        if (student == null || subject == null) {
            return null;
        }
        student.addSubjectToStudent(subject);
        return student;
    }

    public Student[] getStudentListBySubjectId(Integer subjectId) {
        int count = 0;
        for (Student student : studentsArray) {
            if (student != null) {
                if (student.isExists(subjectId)) {
                    count++;
                }
            }
        }
        int index = 0;
        Student[] subjectStudents = new Student[count];
        for (Student student : studentsArray) {
            if (student != null) {
                if (student.isExists(subjectId)) {
                    subjectStudents[index++] = student;
                }
            }
        }
        return subjectStudents;
    }

    /**
     * Exam
     */
    public Exam createExam(Integer studentId, Integer subjectId, Integer grade) {
        Student student = getStudentById(studentId);
        Subject subject = getSubjectById(subjectId);
        if (student == null || subject == null) {
            return null;
        }
        Exam exam = new Exam(generalId++, studentId, student, subjectId, subject, grade);
        exams[examsIndex++] = exam;
        return exam;
    }

    public Exam[] getStudentExamList(Integer studentId) {
        int count = 0;
        for (Exam exam : exams) {
            if (exam != null && exam.getStudentId().equals(studentId)) {
                count++;
            }
        }
        Exam[] newExams = new Exam[count];
        int index = 0;
        for (Exam exam : exams) {
            if (exam != null && exam.getStudentId().equals(studentId)) {
                newExams[index++] = exam;
            }
        }
        return newExams;
    }

    public Student[] getStudentListByExamSubjectId(Integer subjectId) {
        int count = 0;
        for (Exam exam : exams) {
            if (exam != null && exam.getSubjectId().equals(subjectId)) {
                count++;
            }
        }
        int index = 0;
        Student[] studentsList = new Student[count];
        for (Exam exam : exams) {
            if (exam != null && exam.getSubjectId().equals(subjectId)) {
                studentsList[index++] = exam.getStudent();
            }
        }
        return studentsList;
    }

    public Student[] getStudentListByExamGrate(Integer subjectId, Integer grade) {
        int count = 0;
        for (Exam exam : exams) {
            if (exam != null && exam.getSubjectId().equals(subjectId) && exam.getGrade().equals(grade)) {
                count++;
            }
        }
        Student[] newStudents = new Student[count];
        int indexExams = 0;
        for (Exam exam : exams) {
            if (exam != null && exam.getSubjectId().equals(subjectId) && exam.getGrade().equals(grade)) {
                newStudents[indexExams++] = exam.getStudent();
            }
        }
        return newStudents;
    }

    /**
     * Event
     */
    public Event createEvent(String name, Integer professorId) {
        Professor professor = getProfessorById(professorId);
        if (professor == null) {
            return null;
        }
        Event event = new Event(generalId, name, professorId, professor, new Date());
        events[eventIndex++] = event;
        return event;
    }

    public Event[] getEventListByProfessorId(Integer professorId) {
        int count = 0;
        for (Event event : events) {
            if (event != null && event.getProfessorId().equals(professorId)) {
                count++;
            }
        }
        Event[] newEvents = new Event[count];
        int indexEvent = 0;
        for (Event event : events) {
            if (event != null && event.getProfessorId().equals(professorId)) {
                newEvents[indexEvent++] = event;
            }
        }
        return newEvents;
    }

    /* Last one */

    public Object[] getAllEmployeeList() {
        Employee[] employees = new Employee[50];
        int index = 0;
        for (Dean dean : deansArray) {
            if (dean != null) {
                employees[index++] = dean;
            }
        }
        for (Professor professor : professors) {
            if (professor != null) {
                employees[index++] = professor;
            }
        }
        for (Security security : securitiesArray) {
            if (security != null) {
                employees[index++] = security;
            }
        }
        for (Student student : studentsArray) {
            if (student != null) {
                employees[index++] = student;
            }
        }
        return employees;
    }

    public Double getAllEmployeeListSalary() {

        Double totalSum = 0D;
        for (Dean dean : deansArray) {
            if (dean != null) {
                totalSum += dean.getSalary();
            }
        }
        for (Professor professor : professors) {
            if (professor != null) {
                totalSum += professor.getSalary();
            }
        }
        for (Security security : securitiesArray) {
            if (security != null) {
                totalSum += security.getSalary();
            }
        }
        return totalSum;
    }

}
