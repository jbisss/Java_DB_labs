package lecture51;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UserWriter {
    public static void main(String[] args) {
        User me = new User();

        try {
            WriteFile(me);
        }catch (IOException e){
            System.out.println("Error user writing!");
        }
    }
    private static void WriteFile(User usr) throws IOException {
        Path path = Paths.get(".\\files\\usersNames.txt");
        PrintWriter writer = new PrintWriter(new BufferedWriter(new
                FileWriter(path.toString(), true)));

        writer.println(usr.getName());
        writer.println(usr.getSurname());

        writer.close();
    }//end method writeFile
}
