package com.globalpayex;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @Test
    void testArrayList(){
        ArrayList<String> cars = new ArrayList<>();
        assertEquals(0,cars.size());

        //add
        cars.add("i10");
        cars.add("i20");
        assertEquals("i10",cars.get(0));
        assertEquals("i20",cars.get(1));

        cars.add("mercedes");
        assertEquals("i20",cars.get(1));
        assertEquals("mercedes",cars.get(2));

        //update
        cars.set(0,"audi");
        assertEquals("audi",cars.get(0));

        //remove
        cars.remove(0);
        assertEquals("i20",cars.get(0));
    }

}