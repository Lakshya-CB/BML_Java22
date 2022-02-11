package Lec_13;

import java.util.Scanner;

public class Strings_demo {
	public static void main(String[] args) {
		String str = "LOLOL";
		char[] arr_ch = new char[3];
		arr_ch[0] = 'a';
		arr_ch[1] = 'b';
		arr_ch[2] = 'c';

		System.out.println(str);
		System.out.println(arr_ch);
		
		System.out.println("**********");
//		Size!!!?!
		System.out.println(arr_ch.length);
		System.out.println(str.length());
		System.out.println("**********");

//		get char at i index!!
		System.out.println(arr_ch[1]);
		System.out.println(str.charAt(1));
		
		
		System.out.println("**********");
//		print the last char in your string ?!
		System.out.println(str.charAt(str.length()-1));
		
		System.out.println("**********");		
		str="abcdbbbbbbbb";
//		Substring !!
//		System.out.println(str.substring(starting idx,ending idx));
//		System.out.println(str.substring(0,2));
//		System.out.println(str.substring(1,1)+"==");
		for(int i=0;i<str.length();i++) {
			for(int j = i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
//		Take input!!
//		Scanner scn = new Scanner(System.in);
//		String in1 = scn.next();
//		String in2 = scn.next();
//		System.out.println(in1+","+in2);
		
//		To find the index!!
		System.out.println("==============");
		System.out.println(str.indexOf("bc"));
		System.out.println(str.lastIndexOf("bc"));
//		prefix!!
		System.out.println(str.startsWith("abc"));
//		Suffix
		System.out.println(str.endsWith("abc"));
		
//		Compare 2 strings!!
//		System.out.println(str1==str2); ?!! it compares adress!!
//		str1.equal(str2);
		
	}
}
