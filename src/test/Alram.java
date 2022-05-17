package test;

import java.util.Scanner;

public class Alram {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String[] ans = scanner.nextLine().split(" ");
		int H  = Integer.parseInt(ans[0]);
		int M = Integer.parseInt(ans[1]);
		
		M -= 45;
		
		if(M<0) {
			H--;
			M = 60+M;
		}
		
		if(H<0) {
			H = 23;
		}
		
		System.out.print(H+" "+M);
	}
}

