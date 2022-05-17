package test;

import java.util.Scanner;

public class OvenAlram {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in) ;
		
		int  H = scanner.nextInt();
		int M = scanner.nextInt();
		
		int timer = scanner.nextInt();
		
		M +=timer;
		
		H += (M/60);
		
		H %= 24;
		M %= 60;
		
		
		
		System.out.print(H+" "+M);
	}
}
