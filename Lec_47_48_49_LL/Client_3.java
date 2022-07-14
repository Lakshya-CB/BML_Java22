package Lec_47_48_49_LL;

public class Client_3 {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.createCycle();
		System.out.println(LL.isCyclic());
		LL.breakCycle();
		System.out.println(LL.isCyclic());
		LL.disp();
	}
}
