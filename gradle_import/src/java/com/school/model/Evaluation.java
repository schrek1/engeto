package com.school.model;

import java.time.OffsetDateTime;

public class Evaluation {
    private final Student student;
    private final OffsetDateTime dateTime;
    private final byte grade;

    public Evaluation(Student student, OffsetDateTime dateTime, byte grade) {
        this.student = student;
        this.dateTime = dateTime;
        this.grade = grade;
    }

    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public Student getStudent() {
        return student;
    }

    public byte getGrade() {
        return grade;
    }
}
