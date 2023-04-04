package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    private static boolean isMatch(String str, Pattern p){
        Matcher match = p.matcher(str);
        return match.matches();
    }
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-F]{5,}.*");
        String str = "AAAAAAhhh";
        System.out.println(isMatch(str, p));
    }
}
