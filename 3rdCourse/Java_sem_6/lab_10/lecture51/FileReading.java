package lecture51;

import java.io.*;
import java.util.ArrayList;

public class FileReading {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        readFile(employees);
        displayEmployees(employees);
    }

    static void displayEmployees(ArrayList<String> employees){
        for(String employee : employees){
            System.out.println(employee);
        }
    }

    static void readFile(ArrayList<String> employees) {
        String line = "";
        BufferedReader fileInput = null;

        try{
            fileInput = new BufferedReader(new FileReader(new File(".\\files\\employees.txt")));
            line = fileInput.readLine();
            while(line != null){
                employees.add(line);
                line = fileInput.readLine();
            }
            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
