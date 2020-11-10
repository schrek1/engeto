package com.school.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstname;
    private String surname;

    private final String personalIdentifier;

    private List<Subject> optionalSubjects;

    public Student(String firstname, String surname, String personalIdentifier) {
        this.firstname = firstname;
        this.surname = surname;
        this.personalIdentifier = personalIdentifier;
        this.optionalSubjects = new ArrayList<>();
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPersonalIdentifier() {
        return personalIdentifier;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Subject> getOptionalSubjects() {
        return optionalSubjects;
    }

    public void addOptionalSubject(Subject subject) {
        if (subject != null) {
            optionalSubjects.add(subject);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", personalIdentifier='" + personalIdentifier + '\'' +
                ", optionalSubjects=" + optionalSubjects +
                '}';
    }
}
