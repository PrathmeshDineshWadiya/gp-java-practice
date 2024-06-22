package com.globalpayex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PlaySet {
    public static void main(String[] args) {
        HashSet<String> uniqueName = new HashSet<>();
        uniqueName.add("Mehul");
        uniqueName.add("Jane");
        uniqueName.add("Mehul");
        System.out.println(uniqueName);

        var list = Arrays.asList(10,5,3,2,20,8,1,3,8);
        HashSet<Integer> uniqueMarks = new HashSet<>(list);
        System.out.println(uniqueMarks);

        var mDivA = Arrays.asList(1,3,5);
        var mDivB = Arrays.asList(3,5,9);

        HashSet<Integer> s1 = new HashSet<>(mDivA);
        HashSet<Integer> s2 = new HashSet<>(mDivB);

        s1.retainAll(s2);
        System.out.println(s1);

        HashSet<Integer> s3 = new HashSet<>(mDivA);
        HashSet<Integer> s4 = new HashSet<>(mDivB);

        s3.addAll(s4);
        System.out.println(s3);



    }
}
