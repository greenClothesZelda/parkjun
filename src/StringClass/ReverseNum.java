package StringClass;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String first = scanner.next();
		String second = scanner.next();
		
		first = reverse(first);
		second  = reverse(second);
		
		String ans = (Integer.parseInt(first)>Integer.parseInt(second)) ? first: second;
		
		System.out.println(ans);
	}
	
	static String reverse(String first) {
		String s = "";
		for(int i = first.length()-1; i>=0; --i)
			s+=first.charAt(i);
		return s;
	}
}
