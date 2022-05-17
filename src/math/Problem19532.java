package math;

import java.util.*;
import java.io.*;

public class Problem19532 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[6];
		for(int i =0; i<6; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int a=0,b=0;
		loop: for(int x = -999; x<=999; ++x) {
			for(int y =-999; y<=999; ++y) {
				if(arr[0]*x+arr[1]*y == arr[2]&&arr[3]*x+arr[4]*y==arr[5]) {
					a=x;
					b=y;
					break loop;
				}
			}
		}
		
		System.out.println(a+" "+b);
	}
}
