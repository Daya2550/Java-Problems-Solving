package Generic;

public class MethodeLeval {
    public static void main(String[] args) {

        methodeLeval1 m = new methodeLeval1();

        System.out.println(m.Dilapy("Dyanand"));
    }
}
class methodeLeval1 {


    <T> T Dilapy(T data){
        return data;
    }

}