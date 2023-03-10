package com.prisosner;

public class PrisonTest {
    public static void main(String[] args) {
        /* Prisoner p02 = new Prisoner();
        p02.displayInfo();
        p02.displayInfo(true); */

        Prisoner p01 = new Prisoner();
        p01.displayInfo();
        // p01.openDoor(1234);
        // p01.openDoor(4321);

        Cell cell = new Cell("Non-cell", false, 1234);
        cell.setIsOpen(true,4321);
        cell.setIsOpen(true, 1234);
    }
}

class Prisoner {
    private String name;
    private double height;
    private int yearSentenced;
    private Cell cell;

    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setYearSentenced(int yearSentenced) {
        this.yearSentenced = yearSentenced;
    }

    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getYearSentenced() {
        return yearSentenced;
    }
    public Prisoner() {
        this("Ivan Ivanov", 2.0, 4);
        System.out.println("This is a constructor of class.");
        cell = new Cell("Beautiful cell", false, 1234);
    }
    public Prisoner(String name, double height, int yearSentenced) {
        System.out.println("This is a constructor of class.");
        this.name = name;
        this.height = height;
        this.yearSentenced = yearSentenced;
    }
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void setFields(String name, double height, int yearSentenced){
        this.name = name;
        this.height = height;
        this.yearSentenced = yearSentenced;
    }
    @Deprecated
    public void openDoor(int code){
        this.cell.setIsOpen(!this.cell.getIsOpen(), code);
        if(this.cell.getIsOpen()) {
            System.out.println("The door is open");
        } else {
            System.out.println("The door is closed");
        }
    }
    public void displayInfo(){
        System.out.println("Name: " + this.name + "\nHeight: " + this.height
                + "\nYear sentenced: " + this.yearSentenced
                + "\ncom.prisosner.Cell name: " + this.cell.getName() + "\n");
    }
    public void displayInfo(boolean flag){
        this.displayInfo();
        if(flag){
            this.think();
        }
    }
}

class Cell {
    private final String name;
    private boolean isOpen;
    private final int code;
    public Cell(String name, boolean isOpen, int code){
        this.name = name;
        this.isOpen = isOpen;
        this.code = code;
    }

    public String getName(){
        return this.name;
    }
    public boolean getIsOpen(){
        return this.isOpen;
    }
    public void setIsOpen(boolean valueToSet, int code){
        if(code == this.code){
            System.out.println("The code is correct.");
            this.isOpen = valueToSet;
        } else {
            System.out.println("The code is incorrect.");
        }
    }
}

