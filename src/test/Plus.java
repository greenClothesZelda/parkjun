package test;

import java.util.Scanner;

public class Plus {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long[][] num = new long[sc.nextInt()][2];
		
		for(int i = 0; i<num.length; i++) for(int j = 0; j<2; j++) num[i][j] = sc.nextInt();
		for(int i = 0; i<num.length; i++) System.out.println(num[i][0]+num[i][1]);
	}
}
