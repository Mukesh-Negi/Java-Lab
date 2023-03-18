/* 
create a  jagged array with given size of :
row 1 : 4
row 2 : 3
row 3 : 5
find the sum of all elements in this array.
*/
import java.lang.System;
import java.util.Arrays;
import java.util.Scanner;
class jaggedArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int [5];
        System.out.println("ENTER 13 ELEMENTS OF ARRAY :->");
        int sum = 0;
        for( int i = 0; i < arr.length; i++)
        {
            for( int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println("ELEMENTS OF Arr[0] : " + Arrays.toString(arr[0]));
        System.out.println("ELEMENTS OF Arr[1] : " + Arrays.toString(arr[1]));
        System.out.println("ELEMENTS OF Arr[2] : " + Arrays.toString(arr[2]));
        System.out.println("SUM OF ALL ELEMENTS :" + sum);
    }
}
