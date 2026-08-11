package InnerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass(); // Not Required the R.V of parent class

       innerClass.method();
    }
}
class OuterClass {
    void f() {
        System.out.println("OuterClass f()");
    }
    static int x=10;
    int y=20;
    static class InnerClass {
        void method() {
            System.out.println("InnerClass");
            System.out.println(x);

        }
    }
}