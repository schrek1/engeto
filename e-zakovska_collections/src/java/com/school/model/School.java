package com.school.model;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Classroom> classrooms;

    public School() {
        this.classrooms = new ArrayList<>();
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void addClassroom(Classroom classroom) {
        if (classroom != null) {
            classrooms.add(classroom);
        }
    }
}
