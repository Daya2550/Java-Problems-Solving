package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class MAPSIZE {
    public static void main(String[] args) {
        String s=new String("A");
        String s1=new String("A");
        String s2="A";

        HashMap<String,Integer> map=new HashMap<>();
        map.put(s,1);
        map.put(s1,2);
        map.put(s2,3);

        IdentityHashMap<String,Integer> ma1=new IdentityHashMap<>();
        ma1.put(s,1);
        ma1.put(s1,2);
        ma1.put(s2,3);

        System.out.println(map.size());
        System.out.println(ma1.size());
    }
}
