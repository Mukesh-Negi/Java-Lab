//Strings are immutable in jave bcz multiple string references can point to the same string constant which can result in inconsistency.
import java.lang.System;
import java.util.Scanner;
public class strings
{
	public static void main(String[] args)
	{
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "bye";
		String s4 = "hello";
		String s5 = new String ("Hello");
		// " == " operator checks reference NOT constants.
		System.out.println(s1 == s2); // T as s1 and s2 point to same string constant
		System.out.println(s1 == s5); // F as s1 and point to different string constants
		// equals compares values of strings
		System.out.println(s1.equals(s2) );// T as value of s1 and s2 is equal
		System.out.println(s1.equals(s5) ); // T as value of s1 and s5 is equal
	}
}
