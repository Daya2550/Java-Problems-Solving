package DSA;

import Map.CountOfCharecter;

public class LinkedList {
    Node head = null;

    public void insert(int data){
        Node newNode = new Node(data);
    }
    class Node {
        int data;
        Node next = null;
        Node(int d) {
            data = d;
            next = null;
        }
        Node(){

        }
        Node(int d,Node n){
            data = d;
            next = n;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.pushAtFirst(10);
        list.pushAtFirst(20);
        list.pushAtFirst(30);
        list.pushAtFirst(40);
        list.PushAtLast(60);

        list.Display();
        list.DeleteLast();
        list.Display();
       list.CountOfNodes();



    }

    public void Display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public int  Serch(int data) {
        Node current = head;
        while (current != null) {
           if (current.data == data) {
               System.out.println(current.data);
               return current.data;
           }
            current = current.next;
        }
        return -1;
    }


    public  void pushAtFirst(int x){
       if(head==null){
           head = new Node(x);
           return;
       }
       Node newNode = new Node(x);
       newNode.next = head;
       head = newNode;
    }


    public int  deleteAtFirest(){
        if(head==null){
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }


    public void PushAtLast(int x){
        if(head==null){
            head = new Node(x);
            return;
        }
        Node Current = head;
        Node newNode = new Node(x);
        while(Current.next != null){
            Current = Current.next;
        }
        Current.next = newNode;
    }


    public int DeleteLast(){
        if(head==null){
            return -1;
        }
        if(head.next==null){
            int data = head.data;
            head=null;
            return data;

        }
        Node Next = head.next;
        Node Prve = head;
        while(Next.next != null){
            Next = Next.next;
            Prve = Prve.next;
        }
        int data = Next.data;
        Prve.next =null;
        return data;
    }
    public void CountOfNodes(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        else if(head.next==null){
            System.out.println("1");
            return;
        }
        else{
            int count = 1;
            Node CurrentNode =head;
            while(CurrentNode.next!=null){
                CurrentNode = CurrentNode.next;
                count++;
            }
            System.out.println(count);
        }


    }

}
