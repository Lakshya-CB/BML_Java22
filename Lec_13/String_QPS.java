package Lec_13;

import java.util.Scanner;

public class String_QPS {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		String in1 = scn.next();
//		String in1 = scn.nextLine();
//		System.out.println("="+in1);
//		printAllPalinSS(in1);

		String in1 = "the sky is blue";
		reverse(in1);
	}

	public static void reverse(String str) {
		while (true) {
			int idx = str.lastIndexOf(" ");
			String word = str.substring(idx + 1);
			System.out.println(word);
			if(idx==-1) {
				break;
			}
			str = str.substring(0, idx);
		}
	}

	public static void printAllPalinSS(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String ss = str.substring(i, j);
				if (isPalin(ss)) {
					System.out.println(ss);
				}
			}
		}
	}

	public static boolean isPalin(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
