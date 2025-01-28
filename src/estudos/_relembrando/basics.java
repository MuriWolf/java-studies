package estudos._relembrando;

record Book(String author, int page) {}

public class basics {
    public static void main(String[] args) {
        Book bookOne = new Book("Aldous Huxley", 321);

        System.out.println(bookOne);
    }
}
