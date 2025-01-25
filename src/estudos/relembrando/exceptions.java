package estudos.relembrando;

import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Divisão por zero");
        }
    }
}
