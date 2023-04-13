package olegpoprosil.practice4_3.src.practice4_3;

import java.util.Scanner;

public class NonLinear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input double variable:");
		double d=scan.nextDouble();
		if(d<5) {
			d=0;
		}
		System.out.println("Fibonacci index: "+fibonacci(d)+" value "+d);
		scan.close();
	}
	
	static double fibonacci(double d) {
		if(d<2) {
			return d;
		}
		else {
			return fibonacci(d-1)+fibonacci(d-2);
		}
	}
}
