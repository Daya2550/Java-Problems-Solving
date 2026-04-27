package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //[1, 2, 3, 4, 5, 6, 7]
        String s=sc.nextLine();
        s=s.substring(1,s.length()-1);
        String [] arr=s.split(", ");
        leftRotation(arr, 2);

    }

    static void leftRotation(String[] arr, int r) {
        int n = arr.length;
        reverse(arr, 0, r - 1);
        reverse(arr, r, n - 1);
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }


    static void reverse(String[] arr, int start, int end) {
        while (start < end) {
            int temp = Integer.parseInt(arr[start]);
            arr[start] = arr[end];
            arr[end] =Integer.toString(temp);

            start++;
            end--;
        }
    }
}