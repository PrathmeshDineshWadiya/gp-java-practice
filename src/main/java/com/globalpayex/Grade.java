package com.globalpayex;

public class Grade {
    public static char computeGrade(int marks) {
        if (marks > 70 && marks < 100)
        {
            return 'A';
        } else if (marks > 60 && marks < 100)
        {
            return 'B';
        } else if (marks > 40 && marks < 100)
        {
            return 'C';
        } else if (marks <= 40 && marks >= 0)
        {
            return 'F';
        } else if (marks > 100 || marks <0)
        {
            return 'I';
        }
        return 'O';
    }
}