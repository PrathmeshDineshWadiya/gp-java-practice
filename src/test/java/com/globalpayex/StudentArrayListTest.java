package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentArrayListTest {

    @Test
    void testStudentArrayList(){
        ArrayList<Student> students = new ArrayList<>();
        var s1 = new Student("Prathmesh",164,'m',90);
        var s2 = new Student("Jill",145,'f',55);
        var s3 = new Student("Aditya",146,'m',74);
        var s4 = new Student("ALice",131,'f',70);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        var expected = 72.25;

        var actual = StudentArrayList.average(students);
        assertEquals(expected,actual);

    }

}