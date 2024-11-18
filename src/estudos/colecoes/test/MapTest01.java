package estudos.colecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("bom dia", "bonjour");
        map.put("cozinha", "cuisine");
        map.put("pouco", "peu");
        map.put("estudantes", "élèves");
        map.putIfAbsent("estudantes", "étudiants");

        for (String key : map.keySet()) {
            System.out.println(key +": "+ map.get(key));
        }
        System.out.println("------------français------------");
        for (String value: map.values()) {
            System.out.println(value);
        }
        System.out.println("------------key/value------------");
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.printf("key: %s, value: %s%n", entry.getKey(), entry.getValue());
        }
    }
}
