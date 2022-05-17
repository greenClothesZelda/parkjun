package test;

import java.util.Scanner;

public class SmallerThanX {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int max = sc.nextInt();
		sc.nextLine();
		
		String[] ans = sc.nextLine().split(" ");
		int[] arr = new int[ans.length];
		
		for( int i = 0; i<arr.length; i++) 
			arr[i] = Integer.parseInt(ans[i]);
		
		for(int a: arr)
			if(a<max) System.out.print(a+" ");
		
		
	}
}
