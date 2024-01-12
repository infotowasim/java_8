package org.example.ex31PSA.question1;


// Consider a list of employees whose each employee has name,age,city.
// your tasked with filtering the employees, who are older then 30.
// Explain how you would achieve this using the filter operation in the java Stream API.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI1 {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Mithu", "Bangalore", 26),
                new Employee("Sabnam", "Bangalore", 18),
                new Employee("Wasim", "Kolkata", 30),
                new Employee("Rohini", "Kolkata", 32),
                new Employee("Sabana", "Mumbai", 34),
                new Employee("Yousuhana", "Delhi", 31),
                new Employee("Sehenaz", "Kolkata", 17),
                new Employee("Suhana", "Mumbai", 23),
                new Employee("Dona", "Bangalore", 37)
        );

        List<Employee> ListOfAgeMoreThen30 = employeeList.stream().filter(n -> n.getAge() > 30).toList();
        System.out.println(ListOfAgeMoreThen30);


//        for (Employee e : ListOfAgeMoreThen30){
//            System.out.println(e.getName());
//            System.out.println(e.getCity());
//            System.out.println(e.getAge());
//        }


    }


}
