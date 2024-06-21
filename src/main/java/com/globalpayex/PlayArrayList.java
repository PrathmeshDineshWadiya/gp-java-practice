package com.globalpayex;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayArrayList {
    public static void main(String[] args) {
        var nos = Arrays.asList(10,2,20,4,9);

        /* for(Integer n: numbers){
            if(n%2 ==0 && n>4){
                System.out.println(n);
            }
        } */
        nos.forEach(numbers ->{
            if(numbers % 2 ==0 && numbers > 4){
                System.out.println(numbers);
            }
        });

        var names = Arrays.asList("Prathmesh","John","Peter","Jayesh");

        names.forEach(p -> {
            if(p.length() > 5){
                System.out.println(p.toUpperCase());
            }
            else {
                System.out.println(p.toLowerCase());
                System.out.println();
            }
        });
    }
}
