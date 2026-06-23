package Array.Easy;

public class MaxCountOfLongestStringOfOne {
    public static void main(String[] args) {
        int a[]={1,0,1,1,0,1,1,1,0,1,1,1,1};
        int c=0;
        int j=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==1){
                j=j+1;
            }
            else{
                c= Math.max(j,c);
                j=0;
            }
        }
        c= Math.max(j,c);
        System.out.println(c);

    }
}
