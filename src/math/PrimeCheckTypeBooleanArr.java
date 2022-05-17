package math;

import java.io.*;
import java.util.*;

public class PrimeCheckTypeBooleanArr {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		boolean[] notPrimeArr = new boolean[end+1];
		
		//2는 처리 않함
		notPrimeArr[0] = true;
		notPrimeArr[1] = true;
		
		for(int i = 3; i*i<end+1; i+=2) {
			if(notPrimeArr[i]) continue;
			for(int j = i; i*j<notPrimeArr.length; j+=2) {
				notPrimeArr[i*j] = true;
			}
		}
		
		
		
		if(start<3) {
			System.out.println('2');
			start = 3;
		}
		if(start%2 == 0) start++;
		for(int  i = start; i<end+1; i+=2) 
			if(!notPrimeArr[i]) System.out.println(i);
			
		
	}
}
