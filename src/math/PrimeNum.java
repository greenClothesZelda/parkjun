package math;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int startNum = scanner.nextInt();
		int endNum = scanner.nextInt();
		
		PrimeTest p = new PrimeTest();
		
		p.primeCheck(endNum);
		
		for(int i = 0; i<p.checkPoint; ++i) 
			if(p.primeNum[i]>=startNum) System.out.println(p.primeNum[i]); 
		
	}
}
class PrimeTest{
	int[] primeNum = new int[100];
	int checkPoint = 0;
	
	{
		addComponent(2);
	}
	
	
	void primeCheck(int endNum) {
		for(int i = 3; i<=endNum; ++i) 
			primeTest(i);
		
	}
	
	private boolean primeTest(int num) {
		
		if (num<2) return false;
		
		for(int  i =0; i<checkPoint; ++i) {
			if(primeNum[i] == 0) break;
			if(num == primeNum[i])return true;
			if(num%primeNum[i] == 0) 
				return false;
			}
		addComponent(num);
		return true;
		
	}
	
	
	void addComponent(int prime) {
		if(primeNum.length-1 <=checkPoint) {
			int[] newarr = new int[primeNum.length+100];
			primeNum = newarr;
		}
		primeNum[checkPoint] = prime;
		checkPoint ++;
	}
	
	
}