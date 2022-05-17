package ect;

import java.util.Scanner;

public class Paper {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		long sum=0;
		for(int  i=0; i<n*n; ++i) {
			sum +=scanner.nextLong();
		}
		System.out.println(sum);
	}
}
