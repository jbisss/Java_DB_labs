package olegpoprosil.regularexpressionexample.src.regularexpressionexample;
import java.util.regex.*;

public class PatternTest {
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[1-9]{5,}[a-z]{2,}.*");
		String str="12345DaAa";
		System.out.println(isMatch(str, p));
	}
	
	private static boolean isMatch(String str, Pattern p){
		Matcher match = p.matcher(str);
		return match.matches();
	}
}
