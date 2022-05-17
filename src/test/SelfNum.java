package test;

import java.util.Scanner;

public class SelfNum {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	boolean[] numStore = new boolean[10000];
	
	for(int i = 1; i<numStore.length; i++) {
		numCheck(numStore,i);
	}
	
	for(int i = 1; i<numStore.length;i++) if(numStore[i] == false) System.out.println(i);
	}
	static void numCheck(boolean[] arr, int i) {
		
		int fo = i%10;
		int se = i/10%10;
		int th = i/100%10;
		int fi = i/1000%10;
		
		if(fi+se+th+fo+i<10000) arr[fi+se+th+fo+i] = true;
	}
}
