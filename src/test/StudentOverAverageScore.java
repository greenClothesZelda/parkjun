package test;

import java.util.Scanner;

public class StudentOverAverageScore {
	public static void main(String args) {
		Scanner scanner = new Scanner(System.in);
		
		int numOfClass = scanner.nextInt();
		int[][] studentArr = new int[numOfClass][];
		
		for(int j = 0; j<numOfClass; j++) {
			studentArr[j] = new int[scanner.nextInt()];
			for(int k = 0; k<studentArr[j].length; k++) {
				studentArr[j][k] = scanner.nextInt();
				System.out.print("dd");
			}
		}
		
	}
}
