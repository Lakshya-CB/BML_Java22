package Lec_47_48_49_LL;

public class LL_client_2 {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
//		LL.addFirst(0);
//		System.out.println(LL.midAli());
		LL.addLast(10);

//		System.out.println(LL.midAli());
		LL.addLast(20);

//		System.out.println(LL.midAli());
		LL.addLast(30);

//		System.out.println(LL.midAli());
		LL.addLast(40);
		LL.addLast(50);
		LL.addLast(60);
		LL.addLast(70);
		LL.addLast(80);
		LL.addLast(90);

		LL.addLast(100);
		LL.addLast(110);
		LL.disp();
//		System.out.println(LL.midAli());
		LL.KRev(3);
		LL.disp();
	}
}
