package test;

import java.util.Scanner;

public class ArrayMaxMin {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int max = 0;
		int min = 0;
		int[] arr = new int[len];
		for(int  i = 0; i<len; i++) arr[i] = sc.nextInt();
		
		for(int i = 1; i<len; i++) if(arr[i]>arr[max]) max = i;
		for(int i = 1; i<len; i++) if(arr[i]<arr[min]) min = i;
		System.out.println(arr[min]+" "+arr[max]);
	}
}
