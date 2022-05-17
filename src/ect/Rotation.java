package ect;

import java.util.Scanner;

public class Rotation {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.nextLine();
		char[][] ans = new char[a][b];
		
		for(int i =0; i<a; ++i) { 
			String sub = scanner.nextLine();
			for(int k=0; k<b; ++k)
				ans[i][k] = sub.charAt(k);
		}
		
		char[][] roans = change(ans);
		
		for(int k=b-1; k>=0; --k) {
			for(int i = 0; i<a; ++i) 
				System.out.print(roans[k][i]);
			System.out.println();
		
		}
	}
	
	static char[][] change(char[][] ans){
		char[][] arr = new char[ans[0].length][ans.length];
		
		for(int i =0; i<arr.length; ++i) {
			for(int j = 0; j<arr[i].length; ++j) {
				arr[i][j] = check(ans[j][i]);
			}
		}
		return arr;	
	}
	
	static char check(char a) {
		char[] arr = new char[125];
		arr[46] = '.';
		arr[79] = 'O';
		arr[45] = '|';
		arr[124] = '-';
		arr[47] = '\\';
		arr[92] = '/';
		arr[94] = '<';
		arr[60] = 'v';
		arr[118] = '>';
		arr[62] = '^';
		return arr[a];
	}
}
