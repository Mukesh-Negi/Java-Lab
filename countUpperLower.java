// WAP to count  Number of upper and lower case characters in a string.
import java.lang.System;
import java.util.Scanner;
/*
charAt(i) method returns the charcter at index 'i' from the string.
*/
class countUpperLower
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING :->");
        String s;
        s = sc.nextLine();
        int lower = 0;
        int upper = 0;
        for( int i = 0; i < s.length(); i++)
        {
            if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                lower++;
            }
            else if ( s.charAt(i) >= 'A' && s.charAt(i) <='Z') upper++;
        }
        System.out.println(" UPPER CASE LETTERS :->" + upper);
        System.out.println(" LOWER CASE LETTERS :->" + lower);
    }
}
