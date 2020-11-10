package com.school.model;

public class School {
    private Classroom[] classrooms;

    public School(Classroom[] classrooms) {
        this.classrooms = classrooms;
    }

    public Classroom[] getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(Classroom[] classrooms) {
        this.classrooms = classrooms;
    }
}
