package Pattern;

public class FlowOrder {
    public static void main(String[] args) {
        B b=new B();
        System.out.println("Main");
    }
}



class A{
    static{
        System.out.println(" Static :A");
    }

    {
        System.out.println(" Instance :A");
    }

    public A(){
        System.out.println(" ConStructer :A");
    }
}

class B extends A{
    static{
        System.out.println(" Static :B");
    }
    {
        System.out.println(" Instance :B");
    }
    public B(){
        System.out.println(" ConStructer :B");
    }
}