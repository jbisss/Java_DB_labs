package stringOperations;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Duke";
        String str3;
        str3 = "You are " + str2;
        System.out.println("Welcome: " + str3);
        System.out.println("Length: " + str1.length());
        System.out.println("Sub: " + str3.substring(0,5));
        System.out.println("Upper: " + str3.toUpperCase());
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.equals(str2));
    }
}
