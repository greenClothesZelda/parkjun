package test;

import java.util.Scanner;

public class CountArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][10];
		
		for(int i = 0; i<10; i++) arr[0][i] = sc.nextInt();
		
		for(int i=0; i<10; i++) arr[0][i]%=42;
		
		int count = 0;
		
		for(int a: arr[0]) for(int i= 0; i<10; i++) {
			if(arr[0][i]==a) {
				if(0==arr[1][i]++)count++;
				break;
			}
		}
		System.out.print(count);
	}
}
