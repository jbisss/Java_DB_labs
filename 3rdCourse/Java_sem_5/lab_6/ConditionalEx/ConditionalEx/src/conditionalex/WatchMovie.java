/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String[] args) {
        int cost;
        int rate;
        System.out.println("Enter the movie ticket price");
        Scanner in = new Scanner(System.in);
        cost = in.nextInt();
        System.out.println("Enter the movie rating");
        rate = in.nextInt();
        if (cost >= 12 && rate == 5) {
            System.out.println("I'm interested in watching the film");
        } else {
            System.out.println("I'm NOT interested in watching the film");
        }
    }
}
