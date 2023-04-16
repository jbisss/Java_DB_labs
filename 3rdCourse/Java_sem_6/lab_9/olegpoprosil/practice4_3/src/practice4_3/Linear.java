package olegpoprosil.practice4_3.src.practice4_3;

public class Linear {
	public static void main(String[] args) {
		double d=5.;
		System.out.println("factorial value "+factorial(d)+" of "+d);
	}
	
	
	static double factorial(double num) {
		if(num<=1) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
	}
}
