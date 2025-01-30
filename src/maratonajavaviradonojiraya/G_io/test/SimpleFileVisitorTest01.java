package maratonajavaviradonojiraya.G_io.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file.getFileName());

        return FileVisitResult.CONTINUE;
    }
}

class ListJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String fileName = String.valueOf(file.getFileName());
        String regex = "[a-zA-Z0-9_-]+.java";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fileName);

        // usar um endsWith(".java") seria uma solução bem mais fácil

        if (matcher.find()) {
            System.out.println(fileName);
        }

        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        // Files.walkFileTree(root, new ListAllFiles());
        Files.walkFileTree(root, new ListJavaFiles());
    }
}
