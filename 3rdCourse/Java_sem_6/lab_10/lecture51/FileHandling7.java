package lecture51;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileHandling7 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath(".\\files\\employees.txt");
        System.out.println("Default Directory [" + path + "]");
    }
}
