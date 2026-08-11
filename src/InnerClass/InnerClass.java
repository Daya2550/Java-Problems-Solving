package InnerClass;

public class InnerClass {
    public static void main(String[] args) {
        OuterClass_n outer  = new OuterClass_n();
        OuterClass_n.InnerClass_n  innner= outer.new InnerClass_n(); // required the parent object Refence
        innner.method();

    }
}

class OuterClass_n {

    static int a= 0;
    int b=10;



    class InnerClass_n {

        void method() {
            System.out.println("InnerClass");
            System.out.println(b);
        }
    }
}