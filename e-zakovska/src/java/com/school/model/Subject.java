package com.school.model;

import java.util.Arrays;

public enum Subject {

    MATH("Matematika", "Mat"),
    CZECH_LANGUAGE("Český jazyk", "Čj"),
    IT("Informatika", "It");

    private static final int MAX_CAPACITY = 1000;
    private final String name;
    private final String shortcut;
    private final Evaluation[] evaluations;
    private int evaluationIndex;

    Subject(String name, String shortcut) {
        this.name = name;
        this.shortcut = shortcut;
        this.evaluations = new Evaluation[MAX_CAPACITY]; // not good better will be usage of list
        this.evaluationIndex = 0;
    }

    public String getName() {
        return name;
    }

    public String getShortcut() {
        return shortcut;
    }

    public Evaluation[] getEvaluations() {
        return evaluations;
    }

    public Evaluation[] getEvaluationByStudent(Student student) {
        Evaluation[] studentEvaluations = new Evaluation[MAX_CAPACITY];
        int actualIndex = 0;
        for (Evaluation evaluation : evaluations) {
            if (evaluation.getStudent().equals(student)) {
                studentEvaluations[actualIndex] = evaluation;
                actualIndex++;
            }
        }

        return Arrays.copyOfRange(studentEvaluations, 0, actualIndex);
    }

    public void addEvaluation(Evaluation evaluation) {
        if (evaluationIndex == MAX_CAPACITY) {
            throw new RuntimeException("Max evaluation capacity was reached!");
        }
        evaluations[evaluationIndex] = evaluation;
        evaluationIndex += 1;
    }
}
