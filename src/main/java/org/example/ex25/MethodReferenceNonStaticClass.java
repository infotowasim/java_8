package org.example.ex25;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceNonStaticClass {

    private void sachin(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        MethodReferenceNonStaticClass aClass = new MethodReferenceNonStaticClass();

        List<String> students = Arrays.asList("Mithu", "Sabnam", "Wasim", "Sumaiya");
        students.forEach(aClass::sachin);  // for non-static
    }
}
