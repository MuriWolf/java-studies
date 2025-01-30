package maratonajavaviradonojiraya.G_io.test;

import java.io.*;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileWriter fw = new FileWriter(file)) {
           fw.write("ola meu nome é murillo, desenvolvedor Java.");
           fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileReader fr = new FileReader(file)) {
            char[] in = new char[1];
            StringBuilder texto = new StringBuilder();
            while (fr.read(in) != -1) {
               texto.append(in);
            }
            System.out.println(texto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
