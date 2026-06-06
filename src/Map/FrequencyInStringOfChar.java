package Map;

import java.util.HashMap;

public class FrequencyInStringOfChar {
    public static void main(String[] args) {
        String s="abcdefg";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map.toString());
    }
}
