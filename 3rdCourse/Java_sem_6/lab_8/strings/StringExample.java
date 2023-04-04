package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class StringExample {
    private static void searchString(String str, char c){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        System.out.println("The character " + c + " appears in the text " + count + " times.");
    }
    private static void displayStringBackward(String str){
        String strBackward = "";
        for(int i = str.length() - 1; i >= 0; i--){
            strBackward += str.substring(i, i + 1);
        }
        System.out.println(strBackward);
    }
    private static void displaysString(String str) {
        System.out.println(str);
        for (int index = 0; index < str.length(); index++) {
            System.out.println(str.charAt(index));
        }
    }
    public static void main(String[] args) {
        String str = "Sample output";
        displaysString(str);
        displayStringBackward(str);
        searchString(str, 'S');

        ArrayList<String> words = new ArrayList<>(Arrays.asList("slovo", "cow", "SPB", "cool", "car"));
        for(String s : words){
            System.out.print(s + ' ');
        }

        String sentence = "This is my sentence";
        String[] tokens = sentence.split("[ie]");
        System.out.println(Arrays.toString(tokens));

    }
}
