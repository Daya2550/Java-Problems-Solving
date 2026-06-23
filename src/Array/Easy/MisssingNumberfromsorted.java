package Array.Easy;

public class MisssingNumberfromsorted {
    public static void main(String[] args) {
        demo2();
    }
    public static void demo1(){
        int a[]={1,2,3,4,5,6,7,9,10};
        int sum=0;
        int TotalSum=0;
        for(int i=0;i<a.length;i++){
            sum =sum+a[i];
            TotalSum=TotalSum+i+1;
        }
        System.out.println((TotalSum+a.length+1)-sum);
    }

    public static void demo2(){
        int a[]={1,2,3,4,5,6,7,9,10};
        int sum =0;
        int TotalSum=0;
        for(int i=0;i<a.length;i++){
            sum = sum ^ a[i];
            TotalSum =TotalSum ^(i+1);
        }
        TotalSum =TotalSum ^ (a.length+1);
        System.out.println(sum ^ TotalSum);
    }
}
