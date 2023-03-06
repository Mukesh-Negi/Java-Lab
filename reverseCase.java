// WAP to reverse the case of string i.e. lower to upper case and upper to lower case.
import java.util.Scanner;
import java.lang.System;
/*
 * toUpperCase() converts letters of string into upper case.
 * toLowerCase() converts letters of string into lower case.
 */
class reverseCase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println(" ENTER THE STRING :->");
        s = sc.nextLine();
        s = s.toUpperCase();
        System.out.println("After Converting to upper case :->" + s);
        s = s.toLowerCase();
        System.out.println("After Converting to lower case :->" + s);
    }
}
