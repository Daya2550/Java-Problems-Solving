package Map;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class IdentyHashmap2 {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
       map.put("A", 1);
       map.put("B", 2);
       map.put("C", 3);
       map.put("D", 4);

       int c=5;
       for(Integer i:map.values()){
           map.put(""+i,c++);
       }
        System.out.println(map);

    }
}
