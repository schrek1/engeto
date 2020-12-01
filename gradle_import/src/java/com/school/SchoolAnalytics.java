package com.school;


import com.school.model.Classroom;
import com.school.model.School;
import com.school.model.Student;
import com.school.model.Subject;

/**
 * Škola-třída:
 * - výpisy žáků - need tests
 * - výpis počet žáků - předmět - todo
 * - výpis průměrů za předměty - todo
 * - výpis společných předmětů pro třídu - todo
 * - výpis všech volitelných předmětů - todo
 * <p>
 * Třída-Žák:
 * - výpis všech předmětů - need tests
 * - výpis známek z předmětů - todo
 * - výpis průměrů z předmětů - todo
 * - výpis volitelných předmětů - todo
 * - výpis společných předmětů - todo
 * <p>
 * Škola-předmět:
 * - výpis průměru napříč všemi ročníky - todo
 * - výpis počtu žáků napříč všemi ročníky - need tests
 */
public class SchoolAnalytics {

    public String getStudentsByClassroom(School school) {
        StringBuilder output = new StringBuilder();
        output.append("SOUPISKA VSECH STUDENTU\n");
        for (Classroom classroom : school.getClassrooms()) {
            output.append(classroom.getGrade()).append(":\n");
            for (Student student : classroom.getStudents()) {
                output.append("\t").append(student.getSurname()).append(" ").append(student.getFirstname()).append("\n");
            }
            output.append("\n");
        }

        return output.toString();
    }

    public String getStudentsTimetables(Classroom classroom) {
        StringBuilder output = new StringBuilder();
        output.append("ROZVRHY STUDENTU TRIDY ").append(classroom.getGrade()).append("\n");
        output.append("spolecne predmety:\n");
        for (Subject subject : classroom.getClassSubjects()) {
            output.append(subject.getShortcut()).append(" ");
        }
        output.append("\n");

        output.append("individualni predmety:\n");
        for (Student student : classroom.getStudents()) {
            output.append(student.getSurname()).append(" ").append(student.getFirstname()).append("\t");
            for (Subject subject : student.getOptionalSubjects()) {
                output.append(subject.getShortcut()).append(" ");
            }
            output.append("\n");
        }

        return output.toString();
    }

    public String getCountStudentsForSubject(School school) {
        StringBuilder output = new StringBuilder();
        output.append("POCTY ZAKU V PREDMETECH\n");
        for (Subject subject : Subject.values()) {
            output.append(subject.getShortcut()).append(": ");
            int count = 0;
            for (Classroom classroom : school.getClassrooms()) {
                boolean isClassroomSubject = false;
                for (Subject classroomSubject : classroom.getClassSubjects()) {
                    if (classroomSubject == subject) {
                        count += classroom.getStudents().length;
                        isClassroomSubject = true;
                        break;
                    }
                }
                if (!isClassroomSubject) {
                    for (Student student : classroom.getStudents()) {
                        for (Subject optionalSubject : student.getOptionalSubjects()) {
                            if (optionalSubject == subject) {
                                count += 1;
                            }
                        }
                    }
                }
            }
            output.append(count).append("\n");
        }
        return output.toString();
    }

}
