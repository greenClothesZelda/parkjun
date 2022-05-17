package math;

import java.util.Scanner;

public class Length {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		String[] ans = scanner.nextLine().split(" ");
		int[] x = new int[ans.length];
		
		for(int i =0; i<ans.length;i++) x[i] = Integer.parseInt(ans[i]);
		
		System.out.println(check(x));
	}
	
	static int check(int[] arr) {
		int x = arr[2]-arr[0];
		int y = arr[3]-arr[1];
		
		if(x>arr[0]) x = arr[0];
		if(y>arr[1]) y = arr[1];
		
		if(x>y) return  y;
		return x;
		
		
	}
}
