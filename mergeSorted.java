// WAP to merge two sorted arrays in a new array.
// wAP to find sum of all elements of array and find maximum in the array.
import java.lang.System;
import java.util.Arrays;
import java.util.Scanner;
class arrayInput
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("ENTER 10 ELEMENTS OF ARRAY :->");
        for( int i = 0;  i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("ELEMENTS OF ARRAY :" + Arrays.toString(arr));
    }
}
