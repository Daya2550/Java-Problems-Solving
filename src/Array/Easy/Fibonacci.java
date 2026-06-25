package Array.Easy;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;

        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }



    }

}
