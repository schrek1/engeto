package com.school.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Subject {

    MATH("Matematika", "Mat"),
    CZECH_LANGUAGE("Český jazyk", "Čj"),
    IT("Informatika", "It");

    private final String name;
    private final String shortcut;
    private final List<Evaluation> evaluations;

    Subject(String name, String shortcut) {
        this.name = name;
        this.shortcut = shortcut;
        this.evaluations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getShortcut() {
        return shortcut;
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public List<Evaluation> getEvaluationByStudent(Student student) {
        List<Evaluation> studentEvaluations = new ArrayList<>();
        for (Evaluation evaluation : evaluations) {
            if (evaluation.getStudent().equals(student)) {
                studentEvaluations.add(evaluation);
            }
        }

        return studentEvaluations;
    }

}
