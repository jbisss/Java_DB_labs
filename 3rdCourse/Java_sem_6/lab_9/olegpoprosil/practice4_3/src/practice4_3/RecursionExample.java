package olegpoprosil.practice4_3.src.practice4_3;

public class RecursionExample {
	public static void main(String[] args) {
		recurseMethod(4);
		System.out.println(factorial(5));
//		System.out.println(fibonacci(4.0));
	}
	
	static void recurseMethod(int num){
		if(num == 0)
			return;
		else{
			System.out.println("hello " + num);
			recurseMethod(--num);
			System.out.println(""+num);
			return;
		}//endif
	}
	
	public static double factorial(double d) {
		//Sort elements by title case.
		if (d <= 1) {
			return 1;
		}
		else {
			return d * factorial(d - 1);
		}//endif
	}
	
	public static double fibonacci(double d) {
		// Sort elements by title case.
		if (d < 2) {
			return d;
		}
		else {
			return fibonacci(d - 1) + fibonacci(d - 2);
		}//endif
	}
}
