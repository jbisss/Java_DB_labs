package lecture51;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCheckDemo {
    public static void main(String[] args) {
        Path path = Paths.get(".\\files\\IO2");
        boolean path_exists= Files.exists(path);
        System.out.println("Exists? : "+path_exists);
    }
}
