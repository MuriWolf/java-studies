package estudos.relembrando;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5};

        Arrays.fill(numbers, 10);

        System.out.println(Arrays.toString(numbers));
    }
}
