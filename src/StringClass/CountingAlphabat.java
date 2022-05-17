package StringClass;

import java.util.Scanner;

public class CountingAlphabat {
	public static void main(String args[]) {
		int[] count = new int[26];
		Scanner scanner =new Scanner(System.in);
		String ans = scanner.nextLine();
		//System.out.print(ignord(alpha));
		char[] alpha = new char[ans.length()];
		for(int i = 0; i<ans.length(); i++) 
			alpha[i] = ans.charAt(i);
		
		for(char a: alpha)
			count[ignord(a)-'A']++;
		
		int max = 0;
		boolean same = false;
		
		for(int  i=1; i<count.length; i++) {
			if(count[max]<count[i]) {
				max = i;
				same = false;
				//System.out.print(count[max]+" "+count[i]);
			}
			else if(count[max] == count[i]) {
				same =true;
				//System.out.print("max : "+max+""+count[max]+" "+i+""+count[i]);
			}
		}
		
		if(!same) System.out.print((char)(max+(int)'A'));
		else System.out.print('?');
		
	}
	
	static char ignord(char alpha) {
		if((int)alpha>=(int)'a') return (char)(alpha-32);
		return alpha;
	}
}
