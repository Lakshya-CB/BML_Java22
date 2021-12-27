package Lec_1;

import java.util.Scanner;

public class Loop_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		int i = 1;
		while(i<=num) {
			System.out.println("Print");
			i++;
		}
	}

}
