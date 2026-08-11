package InnerClass;

public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass_LocalInnerClass localInnerClass = new OuterClass_LocalInnerClass();
        localInnerClass.method();
    }
}

class OuterClass_LocalInnerClass {
    int a=10;

    public void method() {

        class InnerClass {

            void method() {
                System.out.println("InnerClass");
                System.out.println(a);
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.method();
    }


}