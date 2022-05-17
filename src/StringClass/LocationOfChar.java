package StringClass;

import java.util.Scanner;

public class LocationOfChar {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		int[] alpa = new int[26];
		
		for(int i=0; i<alpa.length; i++) 
			alpa[i] = -1;
		
		for(int i=0; i<ans.length(); i++) 
			if(alpa[ans.charAt(i)-'a']==-1) alpa[ans.charAt(i)-'a'] = i;
		
		for(int a: alpa)
			System.out.print(a+" ");
	}
}
