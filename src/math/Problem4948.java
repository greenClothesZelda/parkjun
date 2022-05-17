package math;

import java.util.*;
import java.io.*;

public class Problem4948 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int[] primeArr = new int[10000];
		primeArr[0] = 2;
		int checkedPoint  = 0;
		loop1: for(int a =3; a<=123456/2; a+=2) {
			for(int b =0; b<=checkedPoint; ++b) 
				if(a%primeArr[b] == 0) {
					continue loop1;
				}
			primeArr[++checkedPoint] = a;
					
		}
		
		int x = Integer.parseInt(br.readLine());
		while(x!=0) {
			int count=0;
			loop:for(int a = x+1; a<=x*2; ++a) {
				for(int k: primeArr) {
					if(k*k>a)break;
					if(k==0) break;
					if(k == a)break;
					if(a%k==0) continue loop;
				}
				count++;
			}
			System.out.println(count);
			x = Integer.parseInt(br.readLine());
		}
		
	}
}
