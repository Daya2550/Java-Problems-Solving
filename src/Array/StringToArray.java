package Array;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String str1="abc";

        String[] split = str1.split("");
        char[] charArray = str1.toCharArray();

        for(Character ch:charArray){
           System.out.println(ch);
        }
    }
}