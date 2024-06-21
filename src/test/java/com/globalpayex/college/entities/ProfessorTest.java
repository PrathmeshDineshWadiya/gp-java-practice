package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;
import com.abc.salary.SalaryCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @BeforeEach
    void init()
    {
        Professor.count = 0;
    }

    @Test
    void testProfessorCount() {
        assertEquals(0,Professor.count);
        String[] array1 = {"C++","Java"};
        String[] array2 = {"C","Python"};

        var p1 = new Professor("Prathmesh",'m',array1,15,5000);
        var p2 = new Professor("John",'m',array2,22,6000);
        assertEquals(2,Professor.count);

//        var noDaysWorked = 10;
//        var costPerDay = 1000;
        var p3 = new Professor("Prathmesh",'m',array1,10,1000);
        var expected = 8820;
        var actual = p3.calculate(); //SalaryCalculator.calculate(p3); --Deprecated class
        assertEquals(expected,actual);

    }

//    @Test
//    void testProfessorDetails(){
//        String[] array = {"C++","Java"};
//
//        var expected = "";
//
//    }

}