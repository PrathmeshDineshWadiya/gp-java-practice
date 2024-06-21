package com.globalpayex;

public class EvenSeries {
    public static String evenSeries(int num)
    {
        String result="";
        for(var i=0;i<=num;i=i+2)
        {
            result=result+i;
            if(i < num-1){
                result+=",";
            }
        }
        return result;
    }
}
