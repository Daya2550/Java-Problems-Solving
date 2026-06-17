package Map;

import java.util.HashMap;

public class CountOfCharecter {

    public  static void main(String[] args) {
        String s="aaabbbccc";  // a3b3c3
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character key:map.keySet()){
            System.out.print(key+""+map.get(key));
        }
    }
}
