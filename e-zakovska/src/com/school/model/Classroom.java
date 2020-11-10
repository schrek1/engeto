package com.school.model;

public class Classroom {

    private Student[] students;
    private Subject[] classSubjects;

    private String grade;

    public Classroom(String grade,
                     Student[] students,
                     Subject[] classSubjects
    ) {
        this.grade = grade;
        this.students = students;
        this.classSubjects = classSubjects;
    }

    public String getGrade() {
        return grade;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Subject[] getClassSubjects() {
        return classSubjects;
    }

    public void setClassSubjects(Subject[] classSubjects) {
        this.classSubjects = classSubjects;
    }
}
