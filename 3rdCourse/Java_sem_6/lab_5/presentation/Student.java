package presentation;

import java.util.ArrayList;

public class Student {
    static void addStudents(ArrayList<String> studentNames){
        studentNames.add("Mark");
        studentNames.add("Andrew");
        studentNames.add("Beth");
    }
    public static void displayStudents(ArrayList<String> studentNames){
        for(String student : studentNames){
            System.out.println("Student name: " + student);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        addStudents(studentNames);
        displayStudents(studentNames);
    }
}
