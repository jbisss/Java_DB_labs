package com.task_7_2;

public class PrisonTest {
    public static void main(String[] args) {
        // task_1
        Prisoner bubba = new Prisoner();
        bubba.name = "Bubba";
        bubba.height = 2.08;
        bubba.yearSentenced = 4;
        Prisoner twitch = new Prisoner();
        twitch.name = "Twitch";
        twitch.height = 1.73;
        twitch.yearSentenced = 3;
        System.out.println(bubba == twitch);
        twitch.name = "Bubba";
        twitch.height = 2.08;
        twitch.yearSentenced = 4;
        System.out.println(bubba == twitch);
        // task_2
        bubba = twitch;
        System.out.println(bubba == twitch);
        // task_3
        Prisoner bubba_1 = new Prisoner();
        Prisoner twitch_1 = new Prisoner();
        bubba_1.name = new String("Bubba");
        twitch_1.name = new String("Bubba");
        System.out.println(bubba_1.name == twitch_1.name);
        bubba_1.name = "Bubba";
        twitch_1.name = "Bubba";
        System.out.println(bubba_1.name == twitch_1.name);
    }
}

class Prisoner {
    public String name;
    public double height;
    public int yearSentenced;
    public void think(){
        System.out.println("I'll have my revenge.");
    }
}
