package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {

    @Test
    void testSetGetMyArray() {
        Integer[] elements = {10,2,30,4,50};
        MyArray a = new MyArray<Integer>(elements);
        a.set(1,100);
        var expected = 100;
        var actual = a.get(1);
        assertEquals(expected,actual);
    }

    @Test
    void testSetGetStudent() {
        Student[] students = {
                new Student("Prathmesh",164,'m',90),
                new Student("Jill",145,'f',55),
                new Student("Aditya",146,'m',74),
                new Student("ALice",131,'f',70)
        };

        Student newStudent = new Student("Vivek",163,'m',95);

        MyArray<Student> a = new MyArray<>(students);
        a.set(1,newStudent);
        var expected = "Vivek";
        var actual = a.get(1).getName();
        assertEquals(expected,actual);
    }

    @Test
    void testSortingAscending(){
        var nos = Arrays.asList(10,2,20,4,9);
        Collections.sort(nos);
        assertEquals(2,nos.get(0));
        assertEquals(20,nos.get(nos.size()-1));
        System.out.println(nos.getClass());
        System.out.println(nos);
    }

    @Test
    void testSortingDescending(){

        /* class DescComparator implements Comparator<Integer> {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        } */

        var nos = Arrays.asList(10,2,20,4,9);

        //anonymous inner class
        /* Collections.sort(nos, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }); */

        //lambda expression - Support Java 8 and Up
        Collections.sort(nos,(o1,o2)->o2.compareTo(o1));
        assertEquals(20,nos.get(0));
        assertEquals(2,nos.get(nos.size()-1));
        System.out.println(nos.getClass());
        System.out.println(nos);
    }

    @Test
    void testEvenNumbersMoreThan2(){
        var nos = Arrays.asList(10,2,20,4,9);
        System.out.println(nos);

        // create a new list consisting of only even numbers more than 2 from the nos list
        /* ArrayList<Integer> evenNumbers = new ArrayList<>();
        nos.forEach(n -> {
            if(n % 2 == 0 && n > 2)
            {
                evenNumbers.add(n);
            }
        }); */

        var evenNumbers = nos.stream()
                .filter(element -> element % 2 ==0 && element > 2)
                .collect(Collectors.toList());

        var expected = Arrays.asList(10,20,4);
        assertEquals(expected,evenNumbers);
    }
}