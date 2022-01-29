package Lec_8;

public class Func_demo_3 {
	static int global = 10999;

	public static void main(String[] args) {
		int a = 1;
		int b = 20;
		System.out.println(a + " : " + b);
		swap(a, b,0);
		System.out.println(global);
		System.out.println(a + " : " + b);
	}

	public static void swap(int a, int b,int global) {
//		global ++;
		Func_demo_3.global++; // Access your global variable to make sure that there is no collision
		
		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
	}
}