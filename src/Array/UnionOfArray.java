package Array;

import java.util.ArrayList;

public class UnionOfArray {
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7,8};
        int b[]={2,3,4,6,7,8,9,10,11,12,13};

        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<Math.max(a.length ,b.length);i++){
           if(a.length>i){
                if(!list.contains(a[i])){
                    list.add(a[i]);
                }
            }
            if(i<b.length){
                if(!list.contains(b[i])){
                    list.add(b[i]);
                }
            }
        }
        System.out.println(list);
    }
}
