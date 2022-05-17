package test;

import java.util.Scanner;

public class jjj {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int numOfClass = scanner.nextInt();
		int[][] studentArr = new int[numOfClass][];
		double[] averageper = new double[numOfClass];
		
		for(int j = 0; j<numOfClass; j++) {
			studentArr[j] = new int[scanner.nextInt()];
			for(int k = 0; k<studentArr[j].length; k++) {
				studentArr[j][k] = scanner.nextInt();
			}
			int count = 0;
			for(int k = 0; k<studentArr[j].length; k++) if(studentArr[j][k]>avg(studentArr[j]))
					count++;
		
			averageper[j] = count/(double)studentArr[j].length*100;
		}
		
		for(double a: averageper) System.out.printf("%.3f%%%n", Math.round(a*1000)/1000.0);
		
		
		/*for(int j = 0; j<numOfClass; j++) {
			for(int k = 0; k<studentArr[j].length; k++) 
				System.out.print(studentArr[j][k]+" ");
			System.out.println();
		}*/
		
	}
	static double avg(int[] Arr) {
		double average = 0;
		for(int i = 0; i<Arr.length; i++) average+=Arr[i];
		return average/=Arr.length;
		
	}
}
