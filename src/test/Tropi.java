package test;

import java.util.Scanner;

public class Tropi {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; ++i) {
			arr[i] = scanner.nextInt();
		}
		int max = arr[0];
		int count = 1;
		
		for(int i = 0; i<n; ++i) {
			if(arr[i]>max) {
				max= arr[i];
				count++;
			}
		}
		System.out.println(count);
		
		max = arr[n-1];
		count = 1;
		for(int i = n-1; i>=0; --i) {
			if(arr[i]>max) {
				max= arr[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
