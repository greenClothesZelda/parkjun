package test;

import java.util.Scanner;

public class CountingStar2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] printLine = new String[n]; 
		for(int i=0;i<printLine.length; i ++) printLine[i] = " ";
		
		for(int i = 1; i<=n; i++) {
			pL(printLine, i);
		}
	}
	static void pL(String[] p, int i) {
		for(int k = 0; k<i;k++ ) p[p.length-i] = "*";
		for(int k = 0; k<p.length; k++) System.out.print(p[k]);
		System.out.println();
	}
}
