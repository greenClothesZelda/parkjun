package math;

import java.util.Scanner;

public class Fibo {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		
		int checkPoint = 0;
		int count  = check(ans, checkPoint);
		System.out.println(count);
	}
	static int check(String ans, int checkPoint) {
		
		//checkPoint가 마지막이라면 1을 반환
		if(ans.length()-1 == checkPoint) {
			//System.out.println(checkPoint+"완료");
			return 1;
		}
		if(ans.length() <=checkPoint) return 0;
		
		//c의 경우
		if(ans.charAt(checkPoint) == 'c') 
			if(ans.charAt(checkPoint+1)=='-'||ans.charAt(checkPoint+1) == '=')
				checkPoint++;
		
		//l의 경우
		if(ans.charAt(checkPoint) == 'l') 
			if(ans.charAt(checkPoint+1)=='j')
				checkPoint++;
		
		//n의 경우
		if(ans.charAt(checkPoint) == 'n') 
			if(ans.charAt(checkPoint+1)=='j')
				checkPoint++;
		
		//s,z의 경우
		if(ans.charAt(checkPoint) == 's'||ans.charAt(checkPoint) == 'z') 
			if(ans.charAt(checkPoint+1)=='=') {
				checkPoint++;
			}
		
		//d의 경우
		if(ans.charAt(checkPoint) == 'd') 
			if(ans.charAt(checkPoint+1)=='-')
				checkPoint++;
		
		if(ans.length()-3 >= checkPoint)
			if(ans.charAt(checkPoint) == 'd') 
				if(ans.charAt(checkPoint+1)=='z'&&ans.charAt(checkPoint+2)=='=')
					checkPoint+=2;
		
		//System.out.println(checkPoint+"완료");
		checkPoint++;
		
		return 1+check(ans, checkPoint);
	}
}
