package bruteForce;
import java.io.*;
import java.util.StringTokenizer;
public class BlackJak {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer ans1 = new StringTokenizer(br.readLine());
		
		int cardNum = Integer.parseInt(ans1.nextToken());
		int max = Integer.parseInt(ans1.nextToken());
		
		StringTokenizer ans2 = new StringTokenizer(br.readLine());
		int[] arr = new int[cardNum];
		//System.out.println("cardNum" + cardNum);
		for(int  i=0; i<cardNum; ++i) {
			int a = Integer.parseInt( ans2.nextToken());
			if(a>max) {
				i--;
				cardNum--;
				continue;
			}
			arr[i] =a;
		}
		
		int[] newArr = new int[cardNum];
		//System.out.println(newArr.length);
		System.arraycopy(arr, 0, newArr, 0, cardNum);
		//System.out.println(newArr.length);
		
		//System.out.println(newArr.length);
		//for(int a: newArr)System.out.println(a);
		
		int min = newArr[0];
		
		for(int a: newArr) 
			if(min>a) min = a;
		//System.out.println(min);
		
		int ans  = max;
			ans = check( newArr, max,min,0);
		System.out.println(max - ans);
		
		
	}
	static int check(int[] arr,int distance,int min, int depth) {
		if(distance<min) return distance;
		depth++;
		
		int[] ansArr = new int[arr.length];
		
		for(int i =0; i<arr.length; ++i) {
			if(distance == arr[i]) System.out.println(distance+" "+depth);
			if(distance >= arr[i]) ansArr[i] = check(arr, distance-arr[i], min,depth);
			else ansArr[i] = distance;
		}
		
		int m = distance;
		
		for(int a: ansArr) 
			if(m>a) m = a;
		
		return m;
	}
}
