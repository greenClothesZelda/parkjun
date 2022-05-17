package math;

import java.util.Scanner;

public class CircleSurface {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int r = scanner.nextInt();
		
		System.out.printf("%f%n",r*r*Math.PI);
		System.out.printf("%f",Math.pow(r, 2)*2);
	}
}
