package Lec_1;

import java.util.Scanner;

public class Report_card_2 {
	public static void main(String[] args) {
//		For taking inputs, first create scanner!!
//		dont forget to import it
		Scanner scn = new Scanner(System.in);
		
		int marks = scn.nextInt();
		int marks1 = scn.nextInt();
		int marks2 = scn.nextInt();
		int marks3 = scn.nextInt();

		
		System.out.println(marks);
		System.out.println(marks1);
		System.out.println(marks2);
		System.out.println(marks3);
		
		if (marks >= 90 && marks <= 100) {
			System.out.println("A");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("D");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("C");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("B");
		} else {
			System.out.println("F");
		}
		System.out.println("END");
	}
}
