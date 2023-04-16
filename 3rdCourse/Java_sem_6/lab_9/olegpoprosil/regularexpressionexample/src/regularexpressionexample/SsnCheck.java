package olegpoprosil.regularexpressionexample.src.regularexpressionexample;

import java.util.Scanner;
public class SsnCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String ssn;
		ssn=getSsn(scan);
		scan.close();
		if(validSsn(ssn))
			System.out.println(ssn + " is a valid Social Security Number!");
		else
			System.out.println("This ssn is not valid! must be in the format of (999-99-9999)");
	}
	
	static boolean validSsn(String ssn) {
		return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
	}

	private static String getSsn(Scanner in){
		System.out.print("Please enter your Social Security Number: ");
		return in.next();
	}
}
