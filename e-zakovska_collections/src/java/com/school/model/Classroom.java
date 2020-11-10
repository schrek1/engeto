package com.school.model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List<Student> students;
    private List<Subject> classSubjects;

    private String grade;


    public Classroom(String grade) {
        this.grade = grade;
        this.students = new ArrayList<>();
        this.classSubjects = new ArrayList<>();
    }

    public String getGrade() {
        return grade;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public List<Subject> getClassSubjects() {
        return classSubjects;
    }

    public void addClassSubject(Subject subject) {
        if (subject != null) {
            classSubjects.add(subject);
        }
    }
}
