/*
                       Type Wrappers in Java

 * Type wrappers are clases which are used to convert primitive data types to objects.
 * Boxing is the process by which primitive data types are converted into objects.
 * Auto  boxing : the conversion of primitive to objects occurs automatically.
 * 
 * Unboxing : the conversion of objects into primitive data types.
 * 
 *              Purpose of Type Wrappers:
 * 1. Objects are needed to call a function by refrence 
 * 2. Collection framework need objects 
 * 3. java.util package needs objects.
 * 4. objects are needed for syncronization.
 */

import java.lang.System;
import java.util.Scanner;
class typeWrapper
{
    public static void main(String args[])
    {
                         // Auto - boxing
        int a = 10;
        Integer intObj1 = Integer.valueOf(a); // explicit conversion
        Integer intObj2 = a; // auto-boxing
        System.out.println(intObj1 + " " + intObj2);

                        // Unboxing
        Integer intObj3 = 100;
        int i = intObj3.intValue(); // Explicit conversion
        int j = intObj3;// unboxing
        System.out.println(i + " " + j);

    }
}