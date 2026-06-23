package Array;

import java.util.Arrays;

public class RemovingDuplictes {
    public static void main(String[] args) {
        int array []={1,1,1,2,2,3,4,5,5,6};
        int j=0;
        for(int i=1;i<array.length;i++){
            if(array[j]!=array[i]){
                j++;
                int temp=array[j];
                array[j]=array[i];
                array[i]=temp;

            }
        }
        for(int i=0;i<=j;i++){
            System.out.println(array[i]);
        }
    }
}
