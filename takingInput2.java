import java.lang.System;
import java.util.Scanner;
// Taking data of various datatype as input from user
public class takingInput2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING :->");
        String str = sc.nextLine();  // taking string input from user

        System.out.println("ENTER A FLOAT VALUE :->");
        float f = sc.nextFloat(); // taking float input from user

        System.out.println("Enter A DOUBLE VALUE :->");
        double d = sc.nextDouble(); // taking double

        System.out.println("String Entered : " + str);
        System.out.println("Float Value Entered : " + f);
        System.out.println("Double Value Entered : " +d);
    }

}
