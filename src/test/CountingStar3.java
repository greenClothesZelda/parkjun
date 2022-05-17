package test;

import java.util.Scanner;

public class CountingStar3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] printLine = new char[n];
		
		for(int i = 0; i<n; i++) printLine[i] = ' ';
		
		for(int i = 0; i<n; i++) {
			printLine[printLine.length-i-1] = '*';
			System.out.println(printLine);
			
		}
	}
}
