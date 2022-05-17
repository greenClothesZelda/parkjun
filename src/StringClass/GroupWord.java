package StringClass;

import java.util.Scanner;

public class GroupWord {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		scanner.nextLine();
		int count = 0;
		
		for(int  i =0 ; i<times; ++i) {
			String word = scanner.nextLine();
			boolean[] alpha = new boolean['z'-'a'+1];
			
			alpha[word.charAt(0)-'a'] = true;
			
			for(int k = 1; k<word.length(); ++k) {
				if(alpha[word.charAt(k)-'a'] == true&&word.charAt(k-1)!=word.charAt(k)) {
					count--;
					break;
				}
				alpha[word.charAt(k)-'a'] = true;
			}
			count++;
		}
		System.out.println(count);
		
	}
}
