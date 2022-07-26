package Lec_54_BST;

public class Client {
	public static void main(String[] args) {
		int[] in = {10,20,30,40,50};
		BST t = new BST(in);
		t.Add(23);
		t.disp();
		System.out.println(t.find(23));
		System.out.println(t.Max());
	}
}
