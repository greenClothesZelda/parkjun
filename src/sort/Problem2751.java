package sort;
import java.io.*;
import java.util.*;
public class Problem2751 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr= new int[n];
		
		for(int i =0; i<n;++i) 
			arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int a: arr)
		{
			sb.append(a).append("\n");
		}
		System.out.println(sb);
	}
}
