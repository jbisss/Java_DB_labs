import java.util.Scanner;

class main{
    public static void main(String[] args) {
        // Собственный рассказ:
        Scanner in = new Scanner(System.in);
        System.out.print("Жил был дед звали его ");
        String name = in.nextLine();
        System.out.println("Однажды " + name + " пошёл охотиться на ");
        String victim = in.nextLine();
        System.out.println("Но " + victim + " оказались не просты. У них была система круговой обороны.");
        System.out.println("На правом фланге они оборонялись с помощью ");
        String rightDefence = in.nextLine();
        System.out.println("На левом фланге и сзади они оборонялись с помощью ");
        String leftAndBackDefence = in.nextLine();
        System.out.println("И с лицевой части они принимали противника с ");
        String faceDefence = in.nextLine();
        System.out.println("Но дед был не прост ведь для охоты он обычно использовал ");
        String weapon = in.nextLine();
        System.out.println("С максимальной дальностью поражения, составляющей: ");
        double distance = in.nextDouble();
        System.out.println("И таких в каждом из его 20 военных ангаров было аж ");
        int countWeapon = in.nextInt();
        System.out.println("А всего получается, что " + countWeapon * 20);
        System.out.print("С дистанции в два раза меньшей, чем максимальная, а то есть " + distance / 2);
        System.out.println(" это оружие наносило максимальный ущерб.");
        System.out.print("Бой шёл ");
        int days = in.nextInt();
        System.out.print(" дня.");
        System.out.print("Потери со стороны " + victim + " составили ");
        int loses = in.nextInt();
        System.out.println(victim + " понесли потери в размере " + loses + " особей за " + days +" дня. "+
                name + " использовал " + weapon + ".");
        in.close();
    }
}

