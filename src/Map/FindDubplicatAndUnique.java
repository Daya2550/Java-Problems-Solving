package Map;

import java.util.HashMap;

public class FindDubplicatAndUnique {
    public static void main(String[] args) {
        String s="Programing";

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.print("Unique Data : ");
        for (Character key : map.keySet()) {
            if(map.get(key)==1){
                System.out.print(key +" ");
            }
        }
        System.out.println(" ");
        System.out.print("Duplicat Data : ");
        for (Character key : map.keySet()) {
            if(map.get(key)!=1){
                System.out.print(key +" ");
            }
        }
    }
}
