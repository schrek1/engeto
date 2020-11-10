package com.school;

import com.school.model.Classroom;
import com.school.model.School;
import com.school.model.Student;
import com.school.model.Subject;

public class Main {

    private static final SchoolAnalytics analytics = new SchoolAnalytics();

    public static void main(String[] args) {
        Student fKarel = new Student("Karel", "Novy", "1", new Subject[0]);
        Student fJan = new Student("Jan", "Modry", "2", new Subject[0]);
        Student sAdam = new Student("Adam", "Kral", "2", new Subject[]{Subject.IT});
        Student sPetr = new Student("Petr", "Fiala", "2", new Subject[0]);
        Classroom first = new Classroom("1.B", new Student[]{fJan, fKarel}, new Subject[]{Subject.MATH});
        Classroom second = new Classroom("2.A", new Student[]{sAdam, sPetr}, new Subject[]{Subject.CZECH_LANGUAGE, Subject.MATH});
        School school = new School(new Classroom[]{first, second});

        System.out.println(analytics.getStudentsByClassroom(school));
        System.out.println(analytics.getStudentsTimetables(second));
        System.out.println(analytics.getCountStudentsForSubject(school));


    }
}
