package Lec_40_Stac;

import Lec_38.Stack;

public class Client {
	public static void main(String[] args) {
		Stack S = new Dynamic_Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		S.dip();
		System.out.println("===========");
		S.add(60);
		S.add(70);
		S.add(80);
		S.add(90);
		S.add(100);
		S.dip();
		
	}
}
