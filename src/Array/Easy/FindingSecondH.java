package Array.Easy;

public class FindingSecondH {

    public static void main(String [] args) {
        int a[] ={1,2,3,4,5,6,6,7,7,8,8};
        int min=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>min){
                max=min;
                min=a[i];
            }
            else if(a[i] !=min && a[i]>max ){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
