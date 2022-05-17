package test;

import java.util.Scanner;

public class ArrayAverage {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		double[] arr = new double[n];
		
		for(int i = 0; i<n; i++) arr[i] = scanner.nextDouble();
		
		int max=0;
		for(int i = 1; i<n; i++) if(arr[max]<arr[i]) max = i;
		final double MAX = arr[max];
		for(int i = 0; i<n; i++) {
			System.out.print("arr["+i+"]"+arr[i]+" * 100/"+MAX);
			arr[i] = arr[i]*100.0/MAX;
			System.out.println(": "+ arr[i]);
		}
		
		double sum = 0.0;
		
		for(double a: arr) sum+=a;
		System.out.print(sum/arr.length);
		
		
	}
}
