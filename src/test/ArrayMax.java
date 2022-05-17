package test;

import java.util.Scanner;

public class ArrayMax {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i = 0; i<9; i++) arr[i] = sc.nextInt();
		int max = 0;
		for(int i = 1; i<9; i++) if(arr[max]<arr[i]) max = i;
		System.out.print(arr[max]+"\n"+ ++max);
	}
}
