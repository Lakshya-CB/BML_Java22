package Lec_2;

import java.util.Scanner;

public class Counting {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int limit = scn.nextInt();

		int n = 1;
		int sum = 0;
		while (n <= limit) {
			
//			System.out.println(n);
			sum=sum+n;
			n++;
		}
		
//		System.out.println(n);
		System.out.println(sum);
		System.out.println("================");
//		int i1 = 10;
//		int i2 = 10;
//		i1++;
//		++i2;
//		System.out.println(i1+1);
//		System.out.println(i2);
		
	}
}
