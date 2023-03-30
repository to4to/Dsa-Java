package Generics_CollectionFrameWork;
import java.util.HashMap;
public class Hashmap {


    public static void main(String[] args) {

        HashMap<Integer,Integer>map= new HashMap<Integer, Integer>();

map.put(1, 100);
map.put(2, 200);
map.put(3, 300);
map.get(1);


map.containsKey(1);
map.containsValue(100);
map.isEmpty();
map.size();
map.keySet();
map.values();
map.entrySet();
map.hashCode();
map.equals(map);
map.clone();
map.clear();
map.remove(1);
map.remove(1, 100);
map.replace(1, 100, 1000);
map.replace(1, 1000);
map.putIfAbsent(1, 1000);
map.putIfAbsent(1, 100);
map.compute(1, (k,v)->v+100);
map.computeIfAbsent(1, k->100);
map.computeIfPresent(1, (k,v)->v+100);
map.merge(1, 100, (v1,v2)->v1+v2);
map.merge(1, 100, (v1,v2)->v1+v2);
map.merge(1, 100, (v1,v2)->v1+v2);
map.merge(1, 100, (v1,v2)->v1+v2);

map.forEach((k,v)->System.out.println(k+" "+v));








    }


}
