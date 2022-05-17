package ect;

import java.util.Scanner;

public class ScanAndPrint {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String ans = scanner.nextLine();
			System.out.println(ans);
		}
	}
}
