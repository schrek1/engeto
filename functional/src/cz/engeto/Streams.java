package cz.engeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<Student> testList = createStudentList();

        List<Student> studentsOlderThan = testList.stream()
                .filter(it -> it.getAge() >= 18)
                .collect(Collectors.toList());

        Map<String, List<Student>> olderStudentByGender = studentsOlderThan.stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println(olderStudentByGender);
    }

    public static List<Student> createStudentList() {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1, "Arpit", "M", 19);
        Student s2 = new Student(2, "John", "M", 17);
        Student s3 = new Student(3, "Mary", "F", 14);
        Student s4 = new Student(4, "Martin", "M", 21);
        Student s5 = new Student(5, "Monica", "F", 16);
        Student s6 = new Student(6, "Ally", "F", 20);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        return studentList;
    }
}
