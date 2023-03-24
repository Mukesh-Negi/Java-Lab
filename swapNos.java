// WAP to swap two integer variables using a funtion.

/*
 NOTE :->  Since there is no call by refrence in Java we can't simply swap values of two primitive
 data types using call by value. We will have to use wrapper classes and convert them into objects,
 as objects are refrence variables.
 */
import java.lang.System;
import java.util.Scanner;
class swapNos
{
    int a, b;
    public static void main( String args[])
    {
        swapNos obj = new swapNos();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER :->");
        obj.a = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER :->");
        obj.b = sc.nextInt();
        swap(obj);
        System.out.println("AFTER SWAPPING : ");
        System.out.println("FIRST NUMBER : " + obj.a);
        System.out.println("SECOND NUMBER : " + obj.b);
    }
    public static void swap(swapNos obj)
    {
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
    }
}