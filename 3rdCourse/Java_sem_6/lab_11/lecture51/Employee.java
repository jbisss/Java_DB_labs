package lecture51;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {

    public static int version = 2;
    private int versionThis;
    private String name;
    private String userName;
    private String email;
    private String password;

    public int getVersionThis() {
        return versionThis;
    }

    public Employee() {
        versionThis = version;
        name = setName();
        userName = setUserName(name);
        email = setEmail(userName);
        password = setPassword(userName);
    }

    private int countChars(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    private String setName() {
        Scanner in = new Scanner(System.in);
        String fullName;
        do {
            System.out.println("Enter Name Surname: ");
            fullName = in.nextLine();
        } while (countChars(fullName, ' ') != 1);
        return fullName;
    }

    private String setUserName(String str) {
        String[] tokens = str.split(" ");
        return tokens[0].toLowerCase() + "." + tokens[1].toLowerCase();
    }

    private String setEmail(String str) {
        String[] tokens = str.split("\\.");
        return tokens[0].charAt(0) + tokens[1] + "@oracleacademy.Test";
    }

    private String setPassword(String str) {
        if (str.length() > 8) {
            str = str.substring(0, 8);
        } else if (str.length() < 8) {
            for (int i = 0; i < 8 - str.length(); i++) {
                str += "*";
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).matches("[Ee]|[Ii]|[Oo]|[Aa]|[Uu]")) {
                str = str.replace(str.charAt(i), '*');
            }
        }
        char minChar = 'z';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < minChar && str.charAt(i) > 'A') {
                minChar = str.charAt(i);
            }
        }
        char u = (char) (minChar - 40);
        str = str.replace(minChar, (char) (minChar - 32));
        return str;
    }

    @Override
    public String toString() {
        return "Employee details\n" + "Name: " + this.name + "\nUsername: " + this.userName + "\nEmail: " + this.email +
                "\nInitial password: " + this.password + "\nObject: " + this.hashCode();
    }
}
