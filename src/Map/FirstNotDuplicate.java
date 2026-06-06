package Map;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class FirstNotDuplicate {

    public static void main(String[] args) {

        String s="Programing";
        s=s.toLowerCase();

        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character key:map.keySet()){
            if(map.get(key)==1){
                System.out.println(key);
                break;
            }
        }

    }
}
