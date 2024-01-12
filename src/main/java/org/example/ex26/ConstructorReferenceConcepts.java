package org.example.ex26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceConcepts {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Mithu", "Sabnam", "Wasim", "Sumaiya");
        List<Student> studentList1 = stringList.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(studentList1);


        List<String> names = Arrays.asList("Mithu", "Sabnam", "Wasim", "Sumaiya");
        List<Student> studentList = names.stream().map(x->new Student(x)).collect(Collectors.toList());
        System.out.println(studentList);

    }
}
