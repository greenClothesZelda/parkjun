package StringClass;

import java.util.Scanner;

public class Dial {
	//private static final char A = 0;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		int[] arr = new int[ans.length()];
		//System.out.println(ans.length());
		
		for(int i = 0; i<arr.length; ++i) {
			switch (ans.charAt(i)){
			case 'A':
			case 'B':
			case 'C':
				arr[i] = 2;
				break;
			case 'D':
			case 'E':
			case 'F':
				arr[i] = 3;
				break;
			case 'H':
			case 'I':
			case 'G':
				arr[i] = 4;
				break;
			case 'K':
			case 'L':
			case 'J':
				arr[i] = 5;
				break;
			case 'M':
			case 'N':
			case 'O':
				arr[i] = 6;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				arr[i] = 7;
				break;
			case 'T':
			case 'U':
			case 'V':
				arr[i] = 8;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				arr[i] = 9;
				break;
			default: 
					arr[i] = 0;
					break;
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i<arr.length; ++i) {
			//System.out.print(arr[i]+" ");
			sum+=arr[i]+1;
		}
		//System.out.println();
		
		System.out.println(sum);
	}
}
