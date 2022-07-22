package Lec_50_51_52_53_BTree;

public class Client {
	public static void main(String[] args) {
//		10 true 20 true 40 false false true 50 false false true 30 false true 60 false false 
//		int[] lvl = {10,20,30,40,50,-1,60};
//		BTree BT = new BTree(lvl);
		
//		int[] pre = {10,20,40,-1,-1,50,-1,-1,30,-1,60};
//		BTree BT = new BTree(pre, false);
		
		
		int[] in = {40,20,50,10,30,60};
		int[] pre = {10,20,40,50,30,60};
		BTree BT = new BTree(pre, in);
		
//		
//		BT.disp();
//		System.out.println(BT.Size());
		System.out.println("======");
		BT.lvlOrder2();
		BT.disp();
	}
}
