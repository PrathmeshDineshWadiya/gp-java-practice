package com.globalpayex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    @ParameterizedTest
    @CsvSource({
            "71,A",
            "61,B",
            "41,C",
            "39,F",
            "200,I",
            "-10,I"
    })
    void testGrade(int marks, char expected) {
        var actual = Grade.computeGrade(marks);
        assertEquals(expected, actual);
    }
}

//    @Test
//  void computeGrade()
//        {
//            var marks=75;
//            var expected='A';
//
//            var actual= Grade.computeGrade(marks);
//            assertEquals(expected,actual);
//
//            marks=65;
//            expected='B';
//
//            actual= Grade.computeGrade(marks);
//            assertEquals(expected,actual);
//
//            marks=55;
//            expected='C';
//
//            actual= Grade.computeGrade(marks);
//            assertEquals(expected,actual);
//
//            marks=38;
//            expected='F';
//
//            actual= Grade.computeGrade(marks);
//            assertEquals(expected,actual);
//
//            marks=-1;
//            expected='I';
//
//            actual= Grade.computeGrade(marks);
//            assertEquals(expected,actual);
//
//        }
//    }