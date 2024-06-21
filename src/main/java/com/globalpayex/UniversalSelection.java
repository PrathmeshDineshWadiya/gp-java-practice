package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.Random;

public class UniversalSelection {
    public static <T> T surpriseMe(T[] elements){
        Random random = new Random();
        int n = random.nextInt(elements.length);
        return elements[n];
    }

    public static void main(String[] args) {
        String[] movies = {"3 Idiots", "Avatar", "Terminator","Robot"};
        String movie = surpriseMe(movies);
        System.out.println(movie);

        Student[] students = {
                new Student("Prathmesh",164,'m',90),
                new Student("Jill",145,'f',55),
                new Student("Aditya",146,'m',74),
                new Student("ALice",131,'f',70)
        };

        Student monitor = surpriseMe(students);
        System.out.println(monitor);

    }
}
