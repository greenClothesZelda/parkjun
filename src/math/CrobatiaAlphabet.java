package math;

import java.util.Scanner;

public class CrobatiaAlphabet {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  n = scanner.nextInt();
		
		long x = factorial(n);
		System.out.println(x);
	}
	
	static long  factorial(long n) {
		if(n == 0) return 1;
		return n*factorial(n-1);
	}
}
