// WAP to merge two sorted arrays in a new array.
// wAP to find sum of all elements of array and find maximum in the array.
import java.lang.System;
import java.util.Arrays;
import java.util.Scanner;
class mergeSorted
{
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 5 ELEMENTS OF ARRAY 1 IN SORTED ORDER :->");
        for( int i = 0;  i < arr1.length; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("ENTER 5 ELEMENTS OF ARRAY 2 IN SORTED ORDER :->");
        for(int i = 0; i < arr2.length; i++)
        {
            arr2[i] = sc.nextInt();
        }
        int merged[] = new int[arr1.length + arr2.length];
        int i = 0; int j = 0;
        int k = 0;
        while( i < arr1.length && j < arr2.length)
        {
            if( arr1[i] <= arr2[j])
            {
                merged[k] = arr1[i];
                i++;
            }
            else
            {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        while( i < arr1.length)
        {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while( j < arr2.length)
        {
            merged[k] = arr2[j];
            j++; 
            k++;
        }
        System.out.println(" MERGED ARRAY :->" + Arrays.toString(merged));
    }
}
