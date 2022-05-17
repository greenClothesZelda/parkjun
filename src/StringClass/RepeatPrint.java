package StringClass;

import java.util.Scanner;

public class RepeatPrint {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		
		char[][] arr = new char[n][];
		
		for(int i = 0; i<n; i++) {
			int a = scanner.nextInt();
			String ans = scanner.next();
			
			arr[i]= new char[ans.length()*a];
			
			for(int j= 0; j<ans.length(); j++)
				for(int k = 0; k<a; k++)
					arr[i][j*a+k] = ans.charAt(j);
					
			//System.out.print(a+ans+arr[i].length);
		}
		
		for(int i = 0; i<n; i++) System.out.println(arr[i]);
	}
}
