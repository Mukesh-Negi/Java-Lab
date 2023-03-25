// WAP to add two numbers by taking input using command line arguments.
/*
 * Command line arguments are used to take input from the terminal while compilaton of 
 * program.
 */
import java.lang.System;
import java.util.Scanner;
class ClineArgs
{
	public static void main(String args[])
	{
		System.out.println( "ARGUMENT 1 :-> " + args[0]);
		System.out.println("ARGUMENT 2 :-> " + args[1]);
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("SUM :-> " +( x + y));
	}
}