import java.lang.System;
import java.util.Scanner;
import java.util.Arrays;
// wap to find Largest string in a string array according to lexographical order.
public class StringArray
{
	public static void main(String[] args)
	{
		String sa[] = {"aaaa", "bbbb", "cccc", "dddd", "zzzz" };
		System.out.println("String Array :-> " + Arrays.toString(sa) );
		String ans = sa[0];
		for(int i = 1; i < sa.length; i++ )
		{
			if( sa[i].compareTo(ans) > 0)
			{
				ans = sa[i];
			}
		}
		System.out.println("Larget Lexographical order string :-> " + ans);// output :-> "zzzz"

	}
}
