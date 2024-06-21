package com.globalpayex;

public class Array {
    public static float average(int[] array){
        int total=0;
        for(int element: array)
        {
            total = total + element;
        }
        return (float)total / array.length;
    }

    public static int maximum(int[] array){
        int max = array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }

    public static int nextGenSum(int... elements){
        var sum=0;
        for(int element: elements)
        {
            sum = sum + element;
        }
        return sum;
    }
}
