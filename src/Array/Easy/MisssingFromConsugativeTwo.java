package Array.Easy;

public class MisssingFromConsugativeTwo {
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,3,4,4,5,5,6,6,7,8,8,9,9,10,10};
        int sum =0;
        for(int i=0; i<a.length; i++){
            sum =sum ^ a[i];
        }
        System.out.println(sum);
    }
}
