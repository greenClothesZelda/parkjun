package math;

import java.util.Scanner;

public class Problem10870 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println( fibo(scanner.nextInt()));
	}
	static int fibo(int x){
		if(x==1) return 1;
		if(x<=0) return 0;
		return fibo(x-1)+fibo(x-2);
	}
	
}
