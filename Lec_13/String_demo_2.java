package Lec_13;

import java.util.Scanner;

public class String_demo_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String in1 = scn.next();
		String in2 = scn.next();
		System.out.println(in1 + "," + in2);
		System.out.println(in1 == in2);
		System.out.println(in1.equals(in2));

	}
}
