package test;

import java.util.Scanner;

public class Factorization {
	public static void main(String argsp[]) {
		Scanner scanner = new Scanner(System.in);
		int ans = scanner.nextInt();
		
		for(int i =2; i<=ans;i++)
			if(ans%i==0) {
				System.out.println(i);
				ans/=i;
				i--;
			}
	}
	
}
