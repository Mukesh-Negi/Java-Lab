/*
 * type wrappers are clases which are used to convert primitive data types to objects.
 * boxing is the process by which primitive data types are converted into objects.
 * auto boxing : the conversion occurs automatically.
 * 
 * purpose of type wrappers:
 * 1. objects are needed to call a function by refrence 
 * 2. collection framework need objects 
 * 3. java.util package needs objects.
 * 4. objects are needed for syncronization.
 */
// WAP to swap to integer variables.
import java.lang.System;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
class typeWrapper
{

    public static void main(String[] args) {
       int a = 10, b = 5;

       typeWrapper obj=new typeWrapper();
       
       System.out.println("INTIAL VALUE :->");
       System.out.println("a = " +a +" b = " +b);
    //    int temp;
    //    temp = a;
    //    a = b;
    //    b = temp;
    Integer obj1=10;
    Integer obj2=20;
        sw(obj1,obj2);

       System.out.println("AFTER SWAP :->");
       System.out.println("a = " +a +" b = " +b);
    
    

    }

    public static void sw(Integer i, Integer j) {
        Integer temp=i;
        i=j;
        j=temp;
    }
}