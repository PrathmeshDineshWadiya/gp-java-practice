package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchStudents {
    public static void main(String[] args) {

        /* var students = Arrays.asList(
                new Student("Tom",1,'m',90),
                new Student("Alice",2,'f',77),
                new Student("Jolly",3,'f',54),
                new Student("Henry",4,'m',60)
        ); */

        HashMap<Integer, Student> students = new HashMap<>();
        students.put(1,new Student("Tom",1,'m',90));
        students.put(2,new Student("Alice",2,'f',77));
        students.put(3,new Student("Jolly",3,'f',54));
        students.put(4,new Student("Henry",4,'m',60));

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your Roll-No : ");
        int rn = s.nextInt();

        if(students.get(rn)!=null){
            System.out.println(students.get(rn));
        }
        else {
            System.out.println("Student Not found");
        }
        /* if(students.contains(new Student("",rn,'n',0))){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        } */
        /* boolean isFound = false;
        for(Student student: students)
        {
            if(student.roll == rn){
                isFound = true;
                System.out.println(student);
                break;
            }
        }
        if(!isFound)
        {
            System.out.println("Not Found");
        } */

        /* var searchStudent = students.stream()
                .filter(student -> student.roll == rn)
                .findFirst();

        var expected = "Not found";

        if(searchStudent.isPresent())
        {
            System.out.println(searchStudent);
        }
        else
        {
            System.out.println("Not found");
        } */
    }
}
