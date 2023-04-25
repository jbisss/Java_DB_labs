package lecture51;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class FilesCopyDemo {
    public static void main(String[] args) {
//create path variables
        Path p = Paths.get(".\\");
        Path p1 = Paths.get("scores");
        Path p2 = Paths.get("backup");
        Path p3 = Paths.get("Highscores.txt");

        //create path for the working directory
        Path woD = p.resolve(p1);
        //create path for the working file
        Path woF = p.resolve(p1.resolve(p3));
        //create path for the backup directory
        Path buD = p.resolve(p2); //create path for the backup file
        Path buF = p.resolve(p2.resolve(p3));
        try {
            if(Files.exists(woF)){
                if(Files.notExists(buD)){
                    Files.createDirectories(buD);
                }
                Files.copy(woF, buF, StandardCopyOption.REPLACE_EXISTING,
                        StandardCopyOption.COPY_ATTRIBUTES);
            }
            if(Files.notExists(woD))
                Files.createDirectories(woD);

            if(Files.notExists(woF))
                Files.createFile(woF);

        }
        catch (IOException x) {
            System.err.println(x);
        }
    }
}
