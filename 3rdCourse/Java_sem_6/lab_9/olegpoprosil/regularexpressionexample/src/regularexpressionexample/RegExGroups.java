package olegpoprosil.regularexpressionexample.src.regularexpressionexample;

import java.util.regex.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class RegExGroups {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String date;
		Pattern dateP = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{2})");
		date = getDate(in, dateP);
		if (validateDate(date)) {
			System.out.println("new date - " + date);
			
		}
		in.close();
	}
	
	static String getDate(Scanner in, Pattern dateP) {
		String date;
		Matcher dateM;
		boolean validDate=false;
		do {
			System.out.print("Enter a Date (dd/mm/yyyy): ");
			date = in.nextLine();
			dateM = dateP.matcher(date);
			if(dateM.matches()){
				String day = dateM.group(1);
				String month = dateM.group(2);
				String year = dateM.group(3);
				validDate = validateDate(date);
				if(dateM.matches() && validDate)
					date = month + "/" + day + "/" + year;
				else
					System.out.println("Incorrect date entered");
				}//endif
		}while(!(dateM.matches() && validDate));
		return date;
	}

	
	static boolean validateDate(String newDate) {
		DateFormat format = new SimpleDateFormat("dd/mm/yy");
		format.setLenient(false);
		String date = newDate;
		try {
			format.parse(date);
			return true;
		}catch(ParseException e) {
			System.out.println(date + " is not valid according to "
					+ ((SimpleDateFormat) format).toPattern() + " pattern.");
			return false;
		}
	}
}
