package com.next;

import java.util.Scanner;

public class PowerOfN {

	public static void main(String[] args) {
		System.out.println("hi");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the m and n value, its m^n : ");
		int n = s.nextInt();
		int m = s.nextInt();
		int p = PowerOfN.power(n, m);
		System.out.println("result : "+p);
	}
	public static int power(int n, int m) {
		if(n == 0){
			System.out.println("m : "+m);
			return 1;
		}
		else{
			System.out.println("m : "+m);
			return m*power(n-1, m);
		}
	}
}
