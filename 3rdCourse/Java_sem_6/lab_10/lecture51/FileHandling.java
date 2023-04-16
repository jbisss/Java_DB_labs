package lecture51;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileHandling {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        readFile(employees);
        displayEmployees(employees);
        writeFile(employees);
    }

    static void displayEmployees(ArrayList<String> employees){
        for(String employee : employees){
            System.out.println(employee);
        }
    }

    static void readFile(ArrayList<String> employees){
        String line = "";
        Path path = Paths.get(".\\files\\employees.txt");

        try{
            BufferedReader fileInput = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);
            line = fileInput.readLine();
            while(line != null){
                employees.add(line);
                line = fileInput.readLine();
            }
            fileInput.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(ArrayList<String> employees){
        Path path = Paths.get(".\\files\\userNames.txt");

        try{
            BufferedWriter bw = Files.newBufferedWriter(path, Charset.forName("ISO-8859-1"), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            for(String employee : employees) {
                bw.write(employee);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
            System.exit(0);
        }
    }
}
