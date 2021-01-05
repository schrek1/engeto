package cz.engeto;

import java.util.Locale;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String studentName = getStudentNameOld(findStudentFromDbOld());
        if (studentName != null) {
            String lowercased = studentName.toLowerCase();
            System.out.println(lowercased);
        } else {
            System.err.println("student name is null...");
        }

        findStudentFromDb()
                .map(Student::getName)
                .map(String::toLowerCase)
                .orElseThrow();

        getStudentName(null)
                .map(String::toLowerCase)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.err.println("student name is null...")
                );

        Optional<String> optName = getStudentName(null);
        if (optName.isPresent()) {
            String name = optName.get();
            String lowercased = name.toLowerCase();
            System.out.println(lowercased);
        }

    }

    private static Optional<Student> findStudentFromDb() {
        return Optional.empty();
    }

    private static Student findStudentFromDbOld() {
        return null;
    }

    public static String getStudentNameOld(Student student) {
        if (student == null) {
            return null;
        }
        return student.getName();
    }

    public static Optional<String> getStudentName(Student student) {
        if (student == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(student.getName());
    }
}
