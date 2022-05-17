package bruteForce;
import java.io.*;
import java.util.*;
public class Problem10211 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<n; ++i) {
			int len = Integer.parseInt(br.readLine());
			
			int[] arr = new int[len];
			int[] sumArr = new int[len+1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j<len; ++j) {
				arr[j] =Integer.parseInt(st.nextToken());
				sumArr[j+1] = sumArr[j]+arr[j];
			}
			
			int max = sumArr[1];
			
			for(int x = 1; x<len+1; ++x) {
				for(int y = 0; y<x; ++y) {
					if(max<(sumArr[x]-sumArr[y])) max = sumArr[x]-sumArr[y];
				}
			}
			
			
			sb.append(max);
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
