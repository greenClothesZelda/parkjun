package math;

import java.io.*;


public class PrimePrint {
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] s = br.readLine().split(" "); 
		
		int startNum =Integer.parseInt(s[0]);
		int endNum = Integer.parseInt(s[1]);
		
		StringBuilder sb = new StringBuilder();
		
		int[] primeArr = new int[100000];
		primeArr[0] = 2;
		int checkPoint = 1;
		
		
		for(int i =3; i<=endNum; i+=2) {
			boolean prime = true;
			
			for(int k = 0; k<checkPoint;++k) {
				if(i%primeArr[k]==0) {
					prime = false;
					break;
				}	
			}
			
			if(prime) {
				primeArr[checkPoint] = i;
				checkPoint++;
			}
		}
		
		
		for(int i = 0; primeArr[i] != 0; ++i) {
			if(primeArr[i]>=startNum) {
				sb.append(primeArr[i]);
				sb.append('\n');
			}
		}
		
		System.out.print(sb);
	}
}
