package estudos.colecoes.test;

// classes do tipo navigable precisam que seus valores sejam comparable ou deve-se implementar o método comparator
// Isto se deve a ser ordenada

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, Integer> map = new TreeMap<>();

        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("A", 1);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() +"-"+ entry.getValue());
        }

        System.out.println(map.higherKey("B"));
    }
}
