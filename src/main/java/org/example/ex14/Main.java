package org.example.ex14;

import org.example.ex13.Employee;

public class Main {
    public static void main(String[] args) {

        // Anynimus
        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "100";
            }

            @Override
            public String getDesignation() {
                return "Software Engineer";
            }
        };
        System.out.println(employee.getSalary());
        System.out.println(employee.getDesignation());
    }
}
