package Generic;

public class ClassLeval {
    public static void main(String[] args) {

        ClassLeval1 g =new ClassLeval1("Dayanand");
        g.Dilapy();
        ClassLeval1 g1 =new ClassLeval1(25);
        g1.Dilapy();
        ClassLeval1 < Integer>g2 =new ClassLeval1 <>(25) ; // Type Safe in that to The Integer Filed .
        g2.Dilapy();
    }
}

class ClassLeval1 <T> {

    T data;
    public ClassLeval1(T data) {
        this.data = data;
    }
   public T GetData(){
      return data;
   }

   void Dilapy(){
       System.out.println(data);
   }
}