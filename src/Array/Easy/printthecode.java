package Array.Easy;

import java.util.Scanner;

public class printthecode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year:");
        int n = sc.nextInt();

        if(n%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }


        }

}
