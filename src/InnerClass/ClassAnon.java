package InnerClass;

public class ClassAnon {
   public static void main(String[] args) {
       OuterClass_2 outer=new OuterClass_2() {
           @Override
           public void method() {
               System.out.println("method");
           }
       };
       outer.method();

   }
}


abstract class OuterClass_2 {
    public abstract void method();
}