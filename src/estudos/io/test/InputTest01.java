package estudos.io.test;

import java.io.Console;
import java.util.Locale;
import java.util.Scanner;

public class InputTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();

        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.printf(Locale.US, "%,d", 10000);
    }
}
