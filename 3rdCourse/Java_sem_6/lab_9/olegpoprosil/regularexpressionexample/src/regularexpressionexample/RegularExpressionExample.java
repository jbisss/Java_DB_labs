package olegpoprosil.regularexpressionexample.src.regularexpressionexample;

public class RegularExpressionExample {

	public static void main(String[] args) {
//		if(getAnimal("Dog"))
//			System.out.println("This is a Valid Animal");
//			else
//			System.out.println("This is not a Valid Animal");
		String word="bat";
		System.out.println(word.substring(2, 0));
		System.out.println(getRhyme(word));

	}
	
	public static boolean getAnimal(String animal) {
		return animal.matches("[Cc]at|[Dd]og");
	}
	public static boolean getRhyme(String word) {
		if(word.length()==3)
			if(word.substring(0,3).equals("at"))
			return true;
			//endif
			return false;
	}
}
