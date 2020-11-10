package com.school.model;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String firstname;
    private String surname;

    private final String personalIdentifier;

    private Subject[] optionalSubjects;

    public Student(String firstname, String surname, String personalIdentifier, Subject[] optionalSubjects) {
        this.firstname = firstname;
        this.surname = surname;
        this.personalIdentifier = personalIdentifier;
        this.optionalSubjects = optionalSubjects != null ? optionalSubjects : new Subject[0];
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

    public Subject[] getOptionalSubjects() {
        return optionalSubjects;
    }

    public void setOptionalSubjects(Subject[] optionalSubjects) {
        this.optionalSubjects = optionalSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstname, student.firstname) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(personalIdentifier, student.personalIdentifier) &&
                Arrays.equals(optionalSubjects, student.optionalSubjects);
    }
}
