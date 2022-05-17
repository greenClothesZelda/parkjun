package math;
import java.io.*;
import java.util.*;

public class TargetLength {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i =0; i<n; ++i) {
			String[] ans = br.readLine().split(" ");
			int[] arr =new int[ans.length];
			
			for(int j = 0; j<ans.length;++j) 
				arr[j] = Integer.parseInt(ans[j]);
			Cal c =new Cal(arr);
			
			System.out.println(c.check());
			
		}
		
	}
}
class Cal{
	int[] arr;
	int r1, r2;
	int lenPow;
	Cal(int[] arr){
		this.arr = arr;
		r1 = arr[2];
		r2 = arr[5];
		lenPow = (arr[0]-arr[3])*(arr[0]-arr[3]);
		lenPow += (arr[1]-arr[4])*(arr[1]-arr[4]);
		//System.out.println(lenPow);
	}
	
	boolean sameCircle() {
		if(lenPow == 0)
			if(r1 == r2) return true;
		return false;
	}
	
	boolean hasDistanse() {
		if(lenPow>(r1+r2)*(r1+r2))return true;
		return false;
	}
	
	boolean contact() {
		if((r1+r2)*(r1+r2)== lenPow) return true;
		if((r1-r2)*(r1-r2)==lenPow)return true;
		return false;
	}
	
	boolean twoPoint() {
		if((r1-r2)*(r1-r2)<lenPow) return true;
		return false;
	}
	
	int check() {
		if(sameCircle())return -1;
		if(contact()) return 1;
		if(hasDistanse()) return 0;
		if(twoPoint()) return 2;
		return 0;
	}
	
}