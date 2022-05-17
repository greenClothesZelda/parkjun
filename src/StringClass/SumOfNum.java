package StringClass;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		String ans = scanner.nextLine();
		int sum = 0;
		for(int  i = 0; i<ans.length(); i++) {
			sum += ans.charAt(i)-'0';
			ans = ans.substring(0,ans.length()-i);
		}
		System.out.print(sum);
	}
}
