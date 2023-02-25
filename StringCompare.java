import java.lang.System;
import java.util.Scanner;
// wap to find which of two strings "Hello" or "hello" is larger.
public class StringCompare
{
	public static void main(String[] args)
	{
		String s1 = "Hello";
		String s2 = "hello";
		String s3 = "bye";
		/* compareTo() function is used to compare the strings. syntax:-> s1.compareTo(s2);
		:-> it compares the first character of string.
		:-> it returns +ve value if s1 is larger than s2
		:-> it returns 0 if s1 and s2 both are equal
		:-> it returns a -ve value if s1 is smaller than s2.
		*/
		System.out.println( s1.compareTo(s2) );
		System.out.println( s2.compareTo(s3) );
	}
}
