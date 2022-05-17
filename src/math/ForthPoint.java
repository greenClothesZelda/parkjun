package math;

import java.util.Scanner;

public class ForthPoint {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] x = new int[3][2];
		
		for(int i = 0; i<3; ++i) {
			x[i][0] = scanner.nextInt();
			x[i][1] = scanner.nextInt();
		}
		int px, py;
		if(x[1][0] == x[2][0]) px = x[0][0];
		else if(x[0][0] == x[2][0]) px = x[1][0];
		else px = x[2][0];
		
		if(x[1][1] == x[2][1]) py = x[0][1];
		else if(x[0][1] == x[2][1]) py = x[1][1];
		else py = x[2][1];
		
		System.out.print(px+" "+py);
		//check(x);
	}
	
	
}
