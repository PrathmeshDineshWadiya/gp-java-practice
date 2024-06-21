package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.ArrayList;

public class StudentArrayList {
    public static double average(ArrayList<Student> s){
        double total = 0;
        double avg = 0;

        for(Student student:s){
            total+=student.marks;
        }
        avg = total/s.size();
        return avg;
    }
}
