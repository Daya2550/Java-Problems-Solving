package Pattern;

import java.util.Collections;

public class simple {
    public static void main(String[] args) {
        int n =5;
        for(int i =1;i<=n;i++){
           // int r=(i%2==0)?2:1;
            for(int j =1;j<=i;j++){
                System.out.print(" "+i+" ");
            }
            System.out.println();
        }
    }
}
