import java.util.Scanner;// Scanner Class is used for taking Input
import java.lang.System;
public class takingInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating obj of Scanner for input
        System.out.println("Enter Number one :-> ");
        int a = sc.nextInt(); // Taking integer input
        System.out.println("Enter Number Two :->");
        int b = sc.nextInt(); // taking another integer input
        int sum = a+b;
        System.out.println("Sum of Two Numbers :-> ");
        System.out.println(sum);
    }
}
