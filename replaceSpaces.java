// WAP to replace all the spaces in the string with a asterisk('*').

/*
 * As strings are immutable in java we can't directly modify it. 
 * replace(first,second) method is used to modify the strings , it replaces all the first sequence of characters to second sequence
 * of characters and return the modified string.
 */
import java.util.Scanner;
import java.lang.System;
class replaceSpaces
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the String :->");
        s = sc.nextLine();
        s = s.replace(' ', '*');
        System.out.println("After Replacing :->" + s);
        s = s.replace("*", "*******");
        System.out.println("After Replacing :->" + s);
    }
}
