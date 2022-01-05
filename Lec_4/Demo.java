package Lec_4;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
//		int in = 100000000000;
//		long l = 1000000000000l;
//		System.out.println(l);
		
		Scanner scn = new Scanner(System.in);
		
		byte b = 120;
		short s = 1000;
		int i = 100000000;
		long l = 1000000000000l;
		
		l = scn.nextLong();
		System.out.println(l);
	}
}
