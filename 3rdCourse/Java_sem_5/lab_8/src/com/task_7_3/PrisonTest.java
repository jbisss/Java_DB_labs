package com.task_7_3;

public class PrisonTest {
    public static void main(String[] args) {
        // task_1
        Prisoner emptyBubba = new Prisoner();
        Prisoner emptyTwitch = new Prisoner();
        System.out.println(emptyBubba.name);
        System.out.println(emptyBubba.height);
        System.out.println(emptyBubba.yearSentenced);
        // task_2
        emptyBubba.setFields("Bubba", 2.08, 4);
        emptyTwitch.setFields("Twitch", 1.73, 3);
        // task_3
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4);
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3);
        // task_4 is included by previous tasks
    }
}

class Prisoner {
    public String name;
    public double height;
    public int yearSentenced;
    public Prisoner() {
        System.out.println("This is a constructor of class.");
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
}

