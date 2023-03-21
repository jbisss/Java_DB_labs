package sort;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int mark;

    public Student(String firstName, String lastName, int mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMark() {
        return mark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString(){
        return "Student details: " + firstName + " " + lastName + " " + mark;
    }

   /* @Override
    public int compareTo(Student otherStudent) {
        if(lastName.compareTo(otherStudent.getLastName()) < 0){
            return -1;
        }
        if(lastName.compareTo(otherStudent.getLastName()) ==0){
            return 0;
        }
        return 1;
    }*/
   @Override
   public int compareTo(Student otherStudent) {
       if(mark < otherStudent.getMark()){
           return -1;
       }
       if(mark == otherStudent.getMark()){
           return 0;
       }
       return 1;
   }
}
