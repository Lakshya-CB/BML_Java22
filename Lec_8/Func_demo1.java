package Lec_8;

public class Func_demo1 {
	public static void main(String[] args) {
//		name1();
//		name2(10,20);
		int a1 = 10;
		int a2 = 20;
		int ans = add(a1, a2);
		System.out.println(ans);
	}

	public static void name1() {
		System.out.println("name 1 ran");
		return;
	}

	public static void name2(int a, int b) {
		System.out.println("name 2 ran");
		System.out.println(a + b);

	}

	public static int add(int a, int b) {
		return a + b;
	}
}
