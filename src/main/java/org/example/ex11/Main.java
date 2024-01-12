package org.example.ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(11, "Mithu");
        Student student2 = new Student(33, "Rohit");
        Student student3 = new Student(22, "Sachin");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Collections.sort(studentList, (a,b)->a.id-b.id);
        System.out.println(studentList);

    }
}
