package Array.Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IntersectArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,5,6,7,8};
        int b[]={1,4,6,11};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(!list.contains(a[i])){
                list.add(a[i]);
            }
        }


        for(int i=0;i<b.length;i++){
            if(list.contains(b[i])){
                System.out.print(b[i]+" ");
            }
        }

        System.out.println(list);
    }
}
