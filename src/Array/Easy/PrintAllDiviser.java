package Array.Easy;

import java.util.ArrayList;

public class PrintAllDiviser {
    public static void main(String[] args) {
        int num=36;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                list.add(i);
                if(num/i!=i){
                    list.add(num/i);
                }
            }
        }
        list.sort(null);
        System.out.println(list);








    }
}




