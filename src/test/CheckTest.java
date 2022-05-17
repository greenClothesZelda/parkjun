package test;

import java.util.Scanner;

public class CheckTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String nS = sc.nextLine();
		int n = Integer.parseInt(nS);
		
		String[] ans = new String[n];
		
		for(int i = 0; i<n; i++) ans[i] = sc.nextLine();
		
		int[] sum = new int[n];
		
		for(int j = 0; j<n; j++) 
			for(int i = 0; i<ans[j].length(); i++) sum[j]+= checkScore(ans[j], i);
		
		for(int a: sum) System.out.println(a);
	}
	static int checkScore(String ans, int i) {
		if(ans.charAt(i)=='O'&&i==0) return 1;
		else if(ans.charAt(i)=='O'&&i>0) return 1+checkScore(ans, --i);
		else return 0;
		
	}
}
