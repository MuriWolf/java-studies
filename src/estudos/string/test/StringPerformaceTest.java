package estudos.string.test;

public class StringPerformaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo para concatenar com string: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo para concatenar com stringBuilder: " + (fim - inicio) + "ms");
    }

    public static void concatString(int tamanho) {
        String txt = "";
        for (int i = 0; i < tamanho; i++) {
            txt += i;
        }
    }

    public static void concatStringBuilder(int tamanho) {
        StringBuilder txt = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            txt.append(i);
        }
    }
}
