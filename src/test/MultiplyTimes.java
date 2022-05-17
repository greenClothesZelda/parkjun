package test;

import java.util.Scanner;

public class MultiplyTimes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = A*B*C;
		
		int len = 1;
		for(len = 1; result / (int)Math.pow(10, len)>0; len++);
		
		int[] arr = new int[len];
		
		for(int i = 0; i<len; i++) {
			arr[i] = result%(int)Math.pow(10, i+1);
			arr[i]/=(int)Math.pow(10, i);
			//System.out.print(arr[i] +" ");
		}
		int[] count = new int[10];
		//System.out.print(len);
		for(int a: arr) {
			count[a]++;
		}
		for(int a: count) System.out.println(a);
		
	}
}
