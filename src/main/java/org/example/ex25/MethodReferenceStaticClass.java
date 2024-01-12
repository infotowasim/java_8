package org.example.ex25;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceStaticClass {

    private static void rohit(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        List<String> students = Arrays.asList("Mithu", "Sabnam", "Wasim", "Sumaiya");
        students.forEach(MethodReferenceStaticClass::rohit);


//        List<String> student1 = Arrays.asList("Mithu","Sabnam","Wasim","Sumaiya");
//        student1.forEach(x-> rohit(x));


//        List<String> students = Arrays.asList("Mithu","Sabnam","Wasim","Sumaiya");
//        students.forEach(x-> System.out.println(x));


    }
}
