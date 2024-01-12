package org.example.ex2;

public class Main {
    public static void main(String[] args) {
        Employee employee = ()-> "Software Engineer";
        System.out.println(employee.getName());

        Employee employee1 = ()-> "Mechanical Engineer";
        System.out.println(employee1.getName());

        Employee employee2 = ()-> "Civil Engineer";
        System.out.println(employee2.getName());
    }
}
