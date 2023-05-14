package lecture51;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class SerializeEmployee {
    public static void main(String[] args) {
        while(true){
            Path path = Paths.get(".\\files\\emp.ser");
            System.out.println("Choose se-1 or de-2:");
            Scanner in = new Scanner(System.in);
            int code = in.nextInt();
            if(code == 1) {
                Employee emp = new Employee();
                System.out.println("Enter where to serialize: ");
                Scanner inIn = new Scanner(System.in);
                String path23 = inIn.nextLine();
                Path pathWhere = Paths.get(path23);
                File file_1 = new File(pathWhere.toUri());
                if(file_1.exists()) {
                    serializeData(emp, pathWhere);
                    System.out.println("Success!");
                }
            } else {
                System.out.println("Enter from where to read: ");
                Scanner inIn = new Scanner(System.in);
                String path23 = inIn.nextLine();
                Path pathFrom = Paths.get(path23);
                File file_2 = new File(pathFrom.toUri());
                if(file_2.exists()) {
                    Employee empEmp = deSerializeData(pathFrom);
                    assert empEmp != null;
                    if(Employee.version != empEmp.getVersionThis()) {
                        System.out.println("Invalid version of a class!");
                    } else {
                        System.out.println("Good version of a class!");
                        displayData(empEmp);
                    }
                }
            }
        }
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
