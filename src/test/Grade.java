package test;

import java.util.Scanner;

public class Grade {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int x = sc.nextInt()/10;
		switch(x) {
		case 10:
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print('B');
			break;
		case 7:
			System.out.print('C');
			break;
		case 6:
			System.out.print('D');
			break;
		default:
			System.out.print('F');
		}	
	}
}