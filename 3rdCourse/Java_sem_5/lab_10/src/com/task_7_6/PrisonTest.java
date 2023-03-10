package com.task_7_6;

public class PrisonTest {
    public static void main(String[] args) {
        Prisoner p1 = new Prisoner();
        Prisoner p2 = new Prisoner();
        p1.displayInfo();
        p2.displayInfo();
    }
}

class Prisoner {
    private static int prisonerCount = 0;
    private final int BOOKING_NUMBER;
    private String name;
    private double height;
    private int yearSentenced;
    private final Cell cell;

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
    public static int getPrisonerCount() {
        return prisonerCount;
    }
    public Prisoner() {
        prisonerCount++;
        this.BOOKING_NUMBER = prisonerCount;
        System.out.println("This is a constructor of class.");
        cell = new Cell("Beautiful cell", false, 1234);
        this.name = null;
        this.height = 0.0;
        this.yearSentenced = 0;
    }
    public Prisoner(String name, double height, int yearSentenced) {
        this();
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
                + "\nCell name: " + this.cell.getName()
                + "\nPrisoners count: " + prisonerCount
                + "\nBooking number: " + this.BOOKING_NUMBER + "\n");
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

