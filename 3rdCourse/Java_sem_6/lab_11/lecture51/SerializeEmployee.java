package lecture51;

import oraclProd.src.oraclProd.EmployeeInfo;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Scanner;


public class SerializeEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Path path = Paths.get(".\\files\\emp.ser");
        serializeData(emp, path);
        deSerializeData(path);
        displayData(emp);
    }
    static void serializeData(Employee emp, Path path){
        try(FileOutputStream fileOut = new FileOutputStream(path.toString());
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut))
        {
            objOut.writeObject(emp);
            System.out.println("Serialized data is saved in " + path);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    static Employee deSerializeData(Path path){
        try(FileInputStream fileIn = new FileInputStream(path.toString());
            ObjectInputStream objIn = new ObjectInputStream(fileIn))
        {
            Employee emp = (Employee) objIn.readObject();
            return emp;
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Emp class not found");
            return null;
        }
        catch(IOException i)
        {
            i.printStackTrace();
            return null;
        }
    }

    public static void displayData(Employee course){
        System.out.println("Deserialized Emp Details...");
        System.out.println(course);
    }//end method displayData
}
