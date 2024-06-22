package com.globalpayex.college.entities;

import com.globalpayex.Grade;

import java.util.Objects;

public class Student extends CollegeUser {
//    String name;
//    private char gender;
    public int roll;
    public int marks;
    static int count;

    /* @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", marks=" + marks +
                '}';
    } */

    public Student(String name, int roll, char gender, int marks) {
        super(name,gender);
        Student.count++;
//        this.name = name;
        this.roll = roll;
//        this.setGender(gender);
        this.marks = marks;
    }

    public Student() {
        this("NA",-1,'m',0);

    }

    public static Object createInstance(String name, int roll, char gender, int marks) {
        var s = new Student(name,roll,gender,marks);
        return s;
    }

    @Override
    public String getDetails(){
        // implicit parameter - this - address of the current object
        String part1 = super.getDetails();
        return String.format(
                "%s\nRoll No: %s\nMarks: %s",
                part1,
                this.roll,
                this.marks
        );
    }


    public char getGrade() {
        int marks=this.marks;
        if (marks > 100 && marks < 0)
        {
            return 'I';
        }
        else if (marks > 70 && marks < 100)
        {
            return 'A';
        } else if (marks > 60 && marks < 100)
        {
            return 'B';
        } else if (marks > 40 && marks < 100)
        {
            return 'C';
        } else {
            return 'F';
        }
    }

    public void setGender(char gender) {
        if(gender == 'm' || gender == 'f'){
            this.gender = gender;
        }
    }

    public char getGender(){
        return this.gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll);
    }

//    public static class StudentsOperation {
//        public static String displayDetails(String name,char gender,int rollNo,int marks){
//            char grade= Grade.computeGrade(marks);
//            String result="";
//            result = "Name: "+name+"\n"+"Gender: "+gender+"\n"+"Roll No: "+rollNo+"\n"+"Marks: "+marks+"\n"+"Grade: "+grade;
//            return result;
//        }
//    }
}
