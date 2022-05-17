package StringClass;

import java.util.Scanner;

public class NumOfWord {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		int count = 1;
		
		if(ans.charAt(0) == ' ') count--;
		if(ans.charAt(ans.length()-1) == ' ') count--;
		 for(int  i = 0; i<ans.length(); ++i) 
			if(ans.charAt(i) == ' ') count++;
		
		System.out.println(count);
	}
}
