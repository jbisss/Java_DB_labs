package strings;

import java.util.Scanner;

public class Custom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        StringBuilder str = new StringBuilder(in.nextLine());
        int code = 0;
        while (code != 4){
            System.out.println("Enter code:\n 1 - add; 2 - replace (2 words); 3 - delete");
            code = in.nextInt();
            if(code == 1){
                String str1;
                System.out.println("Enter 1 word:");
                Scanner in2 = new Scanner(System.in);
                str1 = in2.nextLine();
                str.append(str1);
            } else if (code == 2){
                Scanner in2 = new Scanner(System.in);
                System.out.println("Enter 2 words");
                String[] tokens = in2.nextLine().split(" ");
                str.replace(str.indexOf(tokens[0]), str.indexOf(tokens[0]) + tokens[0].length() + 1, tokens[1]);
            } else if (code == 3){
                Scanner in2 = new Scanner(System.in);
                System.out.println("Enter 1 word");
                String str2 = in2.nextLine();
                str.delete(str.indexOf(str2), str.indexOf(str2) + str2.length() + 1);
            }
            System.out.println(str);
        }

    }
}
