package sort;


import java.util.Arrays;
import java.util.Scanner;
public class SecondProblem {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n;++i) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		
		for(int a: arr)
			System.out.println(a);
	}
}
