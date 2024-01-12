package org.example.ex16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionConcept3 {
    public static void main(String[] args) {

        Student student1 = new Student(1,"MITHU");
        Student student2 = new Student(3,"ROHIT");
        Student student3 = new Student(5,"MITRA");
        Student student4 = new Student(4,"SACHIN");
        Student student5 = new Student(2,"MITHUN");
        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5);

        Function<String,String> get1st3Letters = x->x.substring(0,3);
        Function<List<Student>, List<Student>> studentNameStartWithMITasPrefix = li->{

            List<Student> result = new ArrayList<>();

           for (Student s : li){
            if (get1st3Letters.apply(s.getName()).equalsIgnoreCase("MIT")){
                result.add(s);
            }
           }
           return result;
        };

        List<Student> studentList = studentNameStartWithMITasPrefix.apply(students);
        System.out.println(studentList);


    }


    private static class Student{

        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }




}
