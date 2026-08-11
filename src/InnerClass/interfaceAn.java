package InnerClass;

public class interfaceAn {
    public static void main(String[] args) {
        interfaceA an =()->{
            System.out.println("interfaceA");
        };
        an.method();

        ((interfaceA)()-> System.out.println("Without Reffrence ")).method();

    }
}
interface  interfaceA{
    void method();
}