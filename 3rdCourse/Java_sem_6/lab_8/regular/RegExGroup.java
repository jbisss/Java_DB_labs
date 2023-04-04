package regular;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExGroup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date;
        Pattern dateP = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
        date = getDate(in, dateP);
        System.out.println("US style date - " + date);
        in.close();

        Scanner in2 = new Scanner(System.in);
        String date2;
        Pattern dateP2 = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
        date2 = getDate_2(in2, dateP2);
        System.out.println("US style date - " + date2);
        in2.close();
    }

    private static String getDate(Scanner in, Pattern dateP) {
        String date;
        Matcher dateM;
        do {
            System.out.println("Enter a Date (dd/mm/yyyy): ");
            date = in.nextLine();
            dateM = dateP.matcher(date);
            if (dateM.matches()) {
                String day = dateM.group(1);
                String month = dateM.group(2);
                String year = dateM.group(3);
                date = month + "/" + day + "/" + year;
            }
        } while (!dateM.matches());
        return date;
    }

    static boolean validateDate(String newDate){
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        String date = newDate;
        try {
            format.parse(date);
            return true;
        } catch (ParseException e){
            System.out.println(date + " is not valid according to " +
                    ((SimpleDateFormat) format).toPattern() + " pattern");
            return false;
        }
    }
    private static String getDate_2(Scanner in, Pattern dateP){
        String date;
        Matcher dateM;
        boolean validDate = false;
        do {
            System.out.println("Enter a Date (dd/mm/yyyy): ");
            date = in.nextLine();
            dateM = dateP.matcher(date);
            if (dateM.matches()) {
                String day = dateM.group(1);
                String month = dateM.group(2);
                String year = dateM.group(3);
                validDate = validateDate(date);
                if (dateM.matches() && validDate) {
                    date = month + "/" + day + "/" + year;
                }
            }
        } while (!(dateM.matches() && validDate));
        return date;
    }
}
