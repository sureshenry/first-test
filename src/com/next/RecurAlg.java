package com.next;

import java.util.Scanner;

public class RecurAlg {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer : ");
		int n = s.nextInt();
		int m = RecurAlg.fact(n);
		System.out.println("Fact : "+m);
	}

	private static int fact(int n) {
		if(n == 0)
			return 1;
		else
			return n*fact(n-1);
		
	}
}
