package lesson10;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Map< Integer, List<String> > map = new TreeMap<>();

        List<String > arr = new ArrayList<>(Arrays.asList("A","B","C"));

        map.put(111,arr);
        map.put(112,new ArrayList<>(Arrays.asList("Z","X","C")));
        map.put(113,arr);

        map.remove(113);

        var values = map.values();

        System.out.println(values);
        for (Integer key: map.keySet()){
            System.out.println(map.get(key).get(0));
        }

    }
}
