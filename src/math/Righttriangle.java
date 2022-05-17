package math;

import java.util.Scanner;

public class Righttriangle {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a=0, b=0, c=0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		do {
			
			
			long term = (long)((a*a)+(b*b)+(c*c));
			boolean result = false;
			
			if(term == (long)(a*a*2)) result = true;
			if(term ==  (long)(b*b*2)) result = true;
			if(term == (long)(c*c*2)) result = true;
			
			//else result = false;
			//System.out.println(term);
			
			System.out.println(result ?"right":"wrong");
			
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
		}while((a|b|c)!=0);
	}
}
