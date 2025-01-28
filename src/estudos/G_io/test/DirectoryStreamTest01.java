package estudos.G_io.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("src");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
           for (Path path: stream) {
               System.out.println(path);
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
