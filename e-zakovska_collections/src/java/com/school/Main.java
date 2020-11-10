package com.school;

import com.school.model.Classroom;
import com.school.model.School;
import com.school.model.Student;
import com.school.model.Subject;

public class Main {

    private static final SchoolAnalytics analytics = new SchoolAnalytics();

    public static void main(String[] args) {
        Student fKarel = new Student("Karel", "Novy", "1");
        Student fJan = new Student("Jan", "Modry", "2");

        Student sAdam = new Student("Adam", "Kral", "2");
        sAdam.addOptionalSubject(Subject.IT);
        Student sPetr = new Student("Petr", "Fiala", "2");

        Classroom first = new Classroom("1.B");
        first.addStudent(fJan);
        first.addStudent(fKarel);
        first.addClassSubject(Subject.MATH);

        Classroom second = new Classroom("2.A");
        second.addStudent(sAdam);
        second.addStudent(sPetr);
        second.addClassSubject(Subject.MATH);
        second.addClassSubject(Subject.CZECH_LANGUAGE);

        School school = new School();
        school.addClassroom(first);
        school.addClassroom(second);

        System.out.println(analytics.getStudentsByClassroom(school));
        System.out.println(analytics.getStudentsTimetables(second));
        System.out.println(analytics.getCountStudentsForSubject(school));


    }
}
