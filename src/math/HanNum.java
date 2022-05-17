package math;

import java.util.Scanner;

public class HanNum {
	public static void main(String ans[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int count =0;
		for(int i = 1; i<=x; ++i) {
			//System.out.print(1);
			if(check(i)) count++;
		}
		System.out.print(count);
	}
	
	static boolean check(int x) {
		int count = 1;
		for(count = 1; x/count!=0; count*=10);
		
		int[] arr = new int[count];
		
		for(int i = 0; i<count; ++i) {
			arr[i] = x%10;
			x/=10;
		}
		
		if(count<3) return true;
		
		
		boolean result =true;
		for(int i = 0; i+2<count;++i) {
			if(arr[i]+arr[i+2] != arr[i+1]) {
				result = false;
				break;
			}
			
			
		}
		return result;
	}
}
