package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeInSuVer {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int begin = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		boolean[] check = new boolean[end+1];   //true means !prime, false means prime
		check[0] = true;
		check[1] = true;
		
		for(int i = 2; i*i <= end; i++) {
			if(check[i] == true) continue;
			
			for(int j = i*2; j <= end; j += i) {
				check[j] = true;
			}
		}
		
		if(begin < 3) {
			System.out.println("2");
			begin = 3;
		}
		
		for(int i = begin; i<end+1; i+=2) {
			if(!check[i]) System.out.println(i);
		}
	}
}
