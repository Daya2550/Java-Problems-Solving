package Array.Easy;

public class LCM {

    public static void main(String[] args) {
        int Num1=20;
        int Num2=12;
        int a=Num1;
        int b=Num2;

        while(Num1>=0 || Num2>=0){
            int A=Math.min(Num1,Num2);
            Num1=  Math.max(Num1,Num2) % A;
            Num2= A;
            if( Num1==0 || Num2==0){
                System.out.println("HCF : "+((Num1!=0) ? Num1 :Num2));
                System.out.println("LCM : "+((a*b)/(( Num1!=0) ? Num1 :Num2)));
                break;
            }
        }
    }
}
