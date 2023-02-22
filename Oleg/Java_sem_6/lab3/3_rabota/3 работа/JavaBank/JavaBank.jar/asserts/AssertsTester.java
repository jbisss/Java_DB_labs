package asserts;


import java.util.Scanner;

public class AssertsTester {
    public static void main(String[] args){
        //First();
        //Second();
        Third();
    }

    public static void First(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите неотрицательное число: ");

        int value = scanner.nextInt();
        scanner.close();

        assert (value>=0):"Надо было неотрицательное.....";
        System.out.println("Отлично!");
    }

    public static void Second(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1, 2 or 3:");
        int value = scanner.nextInt();
        scanner.close();
        switch (value){
            case 1:
                System.out.println("One!");
                break;
            case 2:
                System.out.println("Two!");
                break;
            case 3:
                System.out.println("three!");
                break;
            default:
                assert (false);
                break;
        }
    }

    public static void Third(){
        System.out.print("Enter \"CAR\" :");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        assert (line.equals("\"CAR\"")): "Invalid :(";
        System.out.println("Right");
    }
}
