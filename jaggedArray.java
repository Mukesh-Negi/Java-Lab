/* 
create a  jagged array with given size of :
row 1 : 4
row 2 : 3
row 3 : 5
find the sum of all elements in this array.
*/
import java.lang.System;
import java.util.Scanner;
class jaggedArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int [5];
        System.out.println("ENTER  ELEMENTS OF ARRAY :->");
        for( int i = 0; i < arr.length; i++)
        {
            for( int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("ELEMENTS OF ARRAY :" + Arrays.toString(arr));
    }
}
