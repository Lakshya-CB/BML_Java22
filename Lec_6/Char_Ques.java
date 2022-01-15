package Lec_6;

import java.util.Scanner;

public class Char_Ques {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String str = scn.next();
//		char ch = str.charAt(0);
//		
		char ch = scn.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Upper");
		}else if(ch>='a' && ch<='z') {
			System.out.println("Lower");
		}
		
	}
}
