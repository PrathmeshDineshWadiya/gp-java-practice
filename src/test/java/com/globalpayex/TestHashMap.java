package com.globalpayex;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class TestHashMap {

    @Test
    void testMap1(){
        HashMap<Integer, String> map = new HashMap<>();
        assertEquals(0,map.size());

        //add an entry
        map.put(10,"John");
        map.put(5,"Peter");
        assertEquals(2,map.size());

        //get an entry
        assertEquals("John",map.get(10));
        assertEquals("Peter",map.get(5));

        //update an entry in an existing map
        map.put(5,"Jill");
        assertEquals("Jill",map.get(5));

        //delete an entry
        map.remove(10);
        assertEquals(1,map.size());

        // get a list of all the values from the map
        var values = map.values();
        System.out.println(values);

        var keys = map.keySet();
        System.out.println(keys);
        //geta list of all the keys from  the map
    }

}
