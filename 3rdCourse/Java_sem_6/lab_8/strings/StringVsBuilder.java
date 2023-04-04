package strings;

import javax.sound.midi.Soundbank;
import java.net.Socket;

public class StringVsBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Test immutability");
        String str2 = "Test immutability";
        System.out.println("StringBuilder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());
        str.replace(0, str.length(), "HelloWorld");
        str2 = "HelloWorld";
        System.out.println("StringBuilder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());

        StringBuilder str3 = new StringBuilder("Learning Java with Oracle");
        System.out.println("string= " + str3);

        System.out.println("The length of the text is: " + str3.length());
        System.out.println("The character at the beginning is: " + str.charAt(0));
        System.out.println("The second character is: " + str3.charAt(1));
        System.out.println("The position of the start of the text \"acl\" is: " + str.indexOf("acl"));
        System.out.println("The following text is included within the String: " + str3.substring(1 , 4));

        System.out.println("reverse= " + str3.reverse());
        System.out.println("reverse= " + str3.reverse());

        str3.append(" is fun");
        System.out.println("Appended string = " + str3);

        str3.delete(8, 13);
        System.out.println("Deleted string = " + str3);

        str3.insert(8, " Java Programming");
        System.out.println("Inserted string = " + str3);

        str3.replace(13, 25, " String Processing");
        System.out.println("Replaced string = " + str3);

        System.out.println(str3.indexOf("a"));
        System.out.println(str3.indexOf("Q"));
        System.out.println(str3.indexOf("a", 8));
    }
}
