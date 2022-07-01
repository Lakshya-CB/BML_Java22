package Lec_40_Stac;

import Lec_38.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		Stack S = new Dynamic_Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		S.add(60);
		
//		DispRev(S);
//		System.out.println("*****");
//		S.dip();
		S.dip();
		System.out.println("*****");
		Reverse(S);
		S.dip();
		
	}

	public static void DispRev(Stack S) {
		if (S.isEmpty()) {
			return;
		}
//		BP : DispRev(S) with n elements
//		SP : DispRev(S) with n-1 elements
		int ali = S.pop();
		DispRev(S);
		S.push(ali);
		System.out.println(ali);
	}

	public static void Copy(Stack S, Stack org) {
		if (S.isEmpty()) {
			return;
		}
//		BP : DispRev(S) with n elements
//		SP : DispRev(S) with n-1 elements
		int ali = S.pop();
		Copy(S, org);
		org.add(ali);
	}

	public static void Reverse(Stack org) {
		Stack Temp = new Dynamic_Stack();
		while(!org.isEmpty()) {
			int ali = org.pop();
			Temp.add(ali);
		}
		Copy(Temp, org);
	}
}
