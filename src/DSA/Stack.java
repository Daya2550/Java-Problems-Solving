package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Stack {
    public static int  Top =-1;
    public static int MaxSize=5;
    public static int array[]=new int[MaxSize];


    public static void main(String[] args) {
       push(10);
       push(20);
        System.out.println(Arrays.toString(array));
        peek();
    }

    public static void push(int data){
        if(Top<MaxSize){
            Top++;
            array[Top]=data;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    public static int pop(){
        if(Top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int data=array[Top];
            array[Top]=0;
            Top--;
            return data;
        }
    }

    public static int peek(){
        if(Top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return array[Top];
        }
    }
}
