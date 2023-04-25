package lecture51;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class GetAgeDriver {
    public static void main(String[] args) {
        //System.out.println("Result "+ GetAge());
        //System.out.println("Result new "+ newGetAge());

        String result= readFile();
        if(result!=null){
            System.out.println(result);
        }
    }

    private static int GetAge() {
        int age=-1;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Please enter your age: ");
            age = in.nextInt();
        }//end try
        catch(Exception e) {
            System.err.println(e);
        }//end catch
        finally {
            if (in != null)
                in.close();
        }//end finally
        return age;
    }

    private static int newGetAge() {
        int age=-1;
        try (Scanner in = new Scanner(System.in);)
        {
            System.out.print("Please enter your age: ");
            age = in.nextInt();
        }//end try
        catch(Exception e) {
            System.err.println(e);
        }//end catch
        return age;
    }//end method getAge

    private static String readFile() {
        try(BufferedReader br = new BufferedReader
                (new FileReader(".\\files\\employees.txt"))){
            StringBuilder fileContents = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                fileContents.append(line);
                fileContents.append(System.lineSeparator());
                line = br.readLine();
            }
            return fileContents.toString();
        }
        catch (IOException e) {
            System.err.println(e);
        }
        return null;
    }
}
