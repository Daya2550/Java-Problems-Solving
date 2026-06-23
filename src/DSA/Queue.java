package DSA;

import java.util.Arrays;

public class Queue {



    public static int Head=-1;
    public static int Tail=-1;
    public static int MaxSize=10;
    public  static  int [] arr=new int[MaxSize];
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        pop();
       Diaplay();
        System.out.println(peek());
        pop();
        Diaplay();

    }

    public static void Diaplay(){
        for(int i=Head;i<=Tail;i++){
            System.out.print(arr[i]+"-");
        }
        System.out.println();
    }

public static void push(int data ){
        if(Tail >= MaxSize){
            System.out.println("Queue is full");
            return;
        }
        if(Head==-1 && Tail==-1){
            Head=0;
            Tail=0;
            arr[Head]=data;
        }
        else{
            Tail++;
            arr[Tail]=data;
        }
}

public static int pop(){
        if(Tail==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        if(Head==0 && Tail==0){
            int data=arr[Head];
            Head=-1;
            Tail=-1;
            return data;
        }
        int data=arr[Head];
        for(int i=Head;i<Tail;i++){
            arr[i]=arr[i+1];
        }
        Tail--;
        return data;
}

public static int peek(){
        if(Tail==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[Head];
}
}
