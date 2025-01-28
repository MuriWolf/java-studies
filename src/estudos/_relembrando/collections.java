package estudos._relembrando;

import java.util.ArrayList;

public class collections {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("cheval");
        animals.add("chien");
        animals.add("chat");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
