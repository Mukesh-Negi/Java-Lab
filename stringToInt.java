// WAP to find the sum of all the elements of string array that contains numbers as elements.
import java.util.Scanner;
import java.lang.System;
/*
 * Integer.parseInt(s) method is used to convert string s into integer.
 */
class stringToInt
{
    public static void main(String[] args)
    {
        String arr[] = { "10", "20", "30", "40", "50"} ;
        int sum = 0;
        for( int i = 0; i < arr.length; i++)
        {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println("SUM OF ALL ELEMENTS :->" + sum);
    }
}
