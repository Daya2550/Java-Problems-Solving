package Array;

public class HCF {

    public static void main(String[] args) {
        int Num1=20;
        int Num2=12;

//        for(int i=Math.min(Num1,Num2);i>0;i--){
//            if(Num1%i==0 && Num2%i==0){
//                System.out.println(i);
//                break;
//            }
//        }


        while(Num1>=0 || Num2>=0){
            int A=Math.min(Num1,Num2);
            Num1=  Math.max(Num1,Num2) % A;
            Num2= A;
            if( Num1==0 || Num2==0){
                System.out.print( ( Num1!=0) ? Num1 :Num2);
                break;
            }
        }
    }
}

