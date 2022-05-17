package math;

import java.util.Scanner;

public class Sum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String[] ans = scanner.nextLine().split(" ");
		long[] x = new long[ans.length];
		long sum = 0;
		for(int i =0; i<ans.length; ++i) {
			x[i] = Long.parseLong(ans[i]);
			sum+=x[i];
		}
		System.out.print(sum);
		
 	}
}
