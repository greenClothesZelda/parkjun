package function;

import java.util.Scanner;

public class HanNum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		//int x = Integer.parseInt(ans);
		int count = 0;
		
		for(int i = 1; i<=n; ++i) {
			int[] arr = makeArr(i);
			
			if(hanCheck(arr)) count++;
		}
		
		System.out.print(count);
		/*
		int[] arr = makeArr(n);
		for(int i = 0; i<arr.length; ++i)
			System.out.print(arr[i]+" ");
		*/
		
	}
	
	static int[] makeArr(int x) {
		int len = (int)( Math.log10(x)+1 );
		int[] arr = new int[len];
		for(int  i = len-1; i>=0; --i) {
			arr[i] = x%10;
			x/=10;
		}
		return arr;
	}
	static boolean hanCheck(int[] arr) {
		if(arr.length<=2) return true;
		int d = arr[0] - arr[1];
		
		for(int i = 1;i+1<arr.length; ++i) {
			if(arr[i] - arr[i+1] != d) return false;
		}
		return true;
	}
}
