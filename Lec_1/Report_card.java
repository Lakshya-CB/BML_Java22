package Lec_1;

public class Report_card {
	public static void main(String[] args) {
		int marks = 89;

		if (marks >= 90) {
			System.out.println("A");
		} else if (marks >= 80) {
			System.out.println("B");
		} else if (marks >= 70) {
			System.out.println("C");
		} else if (marks >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		System.out.println("END");
	}
}
