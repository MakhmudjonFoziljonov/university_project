package com.company;

import java.time.LocalDate;

public class Test {

    public void start() {
        UniversityManager universityManager = new UniversityManager("TATU");
        // get univer name
//        System.out.println(universityManager.getUniversityName());

        Subject subject = universityManager.createSubject("Calculus", 1);

//        System.out.println("universityManager.getSubjectById(1) = " + universityManager.getSubjectById(subject.getId()));
//        System.out.println("universityManager.getSubjectByName(subject.getName()) = " + universityManager.getSubjectByName(subject.getName()));*/

        Dean dean = universityManager.createDean("Makhmud", "Foziljonov",
                20, "26.10.2003", "Telekom", 1234d);
        Security security = universityManager.createSecurity("Man", "Foziljinov", 21,
                "26.10.2003", 5000.50, "Capitan");
        /*System.out.println("getDeanById = " + universityManager.getDeanById(dean.getId()));*/
        /*System.out.println(universityManager.getDeanEmployedDateById(dean.getId()));*/
        /*System.out.println("universityManager.getDeanByFaculty(dean.getFaculty()) = " + universityManager.getDeanByFaculty(dean.getFaculty()));*/
        /*System.out.println(universityManager.createSecurity("Man", "Foziljinov", 21,
                "26.10.2003", 5000.50, "Capitan"));

        System.out.println(universityManager.createSecurity("qwerty", "asdf", 22,
                "421.09.200", 8900.34, "Leytenant"));

        Security[] leytenants = universityManager.getSecurityListByMilitaryRank("Leytenant");
        System.out.println("Arrays.toString(leytenants) = " + Arrays.toString(leytenants));*/
/*String name,
                                     String surname,
                                     Integer age,
                                     String birthDate,
                                     Integer subjectId,
                                     Double salary*/

        Professor professor = universityManager.createProfessor("Ali", "Aliyev", 21, "26.10.2003", subject.getId(), 5000d);
//        System.out.println("professor = " + professor);
//

//        System.out.println(universityManager.getProfessorById(professor.getId()));

//        System.out.println(universityManager.getProfessorByNameAndBySurname(professor.getName(), professor.getSurname()));

//

        Student student = universityManager.createStudent("Mahmud", "Foziljonov", 21,
                LocalDate.parse("2003-10-26"), 4);
        Student student2 = universityManager.createStudent("Mahmud", "Foziljonov", 21,
                LocalDate.parse("2003-10-26"), 4);

        Student student3 = universityManager.createStudent("Mahmud3", "Foziljonov3", 21,
                LocalDate.parse("2003-10-26"), 4);
//        System.out.println("universityManager.getStudentById(student.getId()) = " + universityManager.getStudentById(student.getId()));
        Student[] students = universityManager.getStudentListByLevel(student2.getLevel());
//        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));

        Student student1 = universityManager.addSubjectToStudent(student.getId(), subject.getId());
       /* Subject[] subjects = student1.getSubjects();
        System.out.println("Arrays.toString(subjects) = " + Arrays.toString(subjects));*/
//
//        for (Student student3 : universityManager.getStudentListBySubjectId(subject.getId())) {
//            System.out.println(student3);
//        }

        Exam exam = universityManager.createExam(student3.getId(), subject.getId(), 5);
        Exam exam1 = universityManager.createExam(student.getId(), subject.getId(), 3);


//        for (Exam exam1 : universityManager.getStudentExamList(student3.getId())) {
//            System.out.println(exam1);
//        }
//        for (Student student4 : universityManager.getStudentListByExamSubjectId(subject.getId())) {
//            System.out.println(student4);
//        }

//        Event event = universityManager.createEvent("Event", professor.getId());
//        for (Event event1 : universityManager.getEventListByProfessorId(event.getProfessorId())) {
//            System.out.println(event1);


//        for (Object o : universityManager.getAllEmployeeList()) {
//            if (o != null)
//                System.out.println(o);
//        }

        System.out.println(universityManager.getAllEmployeeListSalary());


    }
}
