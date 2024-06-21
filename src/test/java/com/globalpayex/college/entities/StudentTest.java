package com.globalpayex.college.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeEach
    void init()
    {
        Student.count = 0;
    }

    @Test
    void testObjectCreation()
    {
        assertEquals(0,Student.count);
        var s1 = new Student();
        var s2 = new Student();
        assertEquals(2,Student.count);
        assertTrue(s1!=s2);
        assertNotNull(s1.name);
        assertNotNull(s2.name);
        assertEquals(-1,s1.roll);
        assertEquals(-1,s2.roll);

        s1.roll=10;
        s2.roll=20;

        assertEquals(10,s1.roll);
        assertEquals(20,s2.roll);

    }

    @Test
    void testGetDetails()
    {
        var s1 = new Student("Prathmesh",10,'m',90);

        String expected= "Name: Prathmesh\nGender: m\nRoll No: 10\nMarks: 90";
        String actual = s1.getDetails();
        assertEquals(expected,actual);

        int i = 10;
        System.out.println(i);
        System.out.println(s1);
    }

    @Test
    void testGetGrades(){
        var s1 = new Student();
        s1.marks=75;
        char expected = 'A';

        var actual = s1.getGrade();
        assertEquals(expected,actual);

    }

    @Test
    void testNewWayOfStudentCreation(){
        var s1 = Student.createInstance("Prathmesh",10,'m',90);
    }

    @Test
    void testValidGender() {
        var s = new Student();
        s.setGender('x');
        assertNotEquals('x', s.getGender());

        s.setGender('m');
        assertEquals('m', s.getGender());

        s.setGender('f');
        assertEquals('f', s.getGender());

        var s1 = new Student("Prathmesh",10,'x',90);
        assertNotEquals('x',s1.getGender());

    }
}