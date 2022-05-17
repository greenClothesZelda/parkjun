package bruteForce;
import java.util.*;
import java.io.*;

public class Problem2309 {
	public static void main(String args[]) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int[] tall =new int[9];
		int sum = 0;
		for(int i =0; i<9; ++i) {
			tall[i] = Integer.parseInt(br.readLine());
			sum+=tall[i];
		}
		sum-=100;
		int [] ans = new int[2];
		
		loop: for(int i =0; i<9; ++i) {
			for(int j =0; j<i; ++j) {
				if(tall[i]+tall[j] ==sum) {
					ans[0] = tall[i];
					ans[1] =tall[j];
					break loop;
				}
			}
		}
		Arrays.sort(tall);
		
		for(int a: tall) {
			if(a != ans[0]&&a!=ans[1])System.out.println(a);
		}
			
	}
}
