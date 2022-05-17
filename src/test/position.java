package test;
import java.util.*;
public class position {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int term = 1;
		
		if(y>0&&x>0) term = 1;
		else if(y>0&&x<0) term = 2;
		else if(y<0&&x<0) term = 3;
		else term = 4;
		
		System.out.println(term);
	}
}
