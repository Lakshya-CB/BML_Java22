package Lec_50_51;

import java.util.Scanner;

public class BTree {
	class Node {
		public Node(int dd) {
			// TODO Auto-generated constructor stub
			data = dd;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void disp() {
		disp(root);
	}

	private void disp(Node nn) {
		if (nn == null) {
			return;
		}
		String ans = "";
		if (nn.left != null) {
			ans = ans + nn.left.data;
		}
		ans = ans + "=>" + nn.data + "<=";
		if (nn.right != null) {
			ans = ans + nn.right.data;
		}
		System.out.println(ans);
		disp(nn.left);
		disp(nn.right);
	}

	private void disp_pre(Node nn) {
		if (nn == null) {
			return;
		}
//		SLR
		System.out.println(nn.data);
		disp_pre(nn.left);
		disp_pre(nn.right);
	}

	private void disp_in(Node nn) {
		if (nn == null) {
			return;
		}
//		LSR
		disp_in(nn.left);
		System.out.println(nn.data);
		disp_in(nn.right);
	}

	private void disp_post(Node nn) {
		if (nn == null) {
			return;
		}
//		LRS
		disp_post(nn.left);
		disp_post(nn.right);
		System.out.println(nn.data);

	}

	Scanner scn = new Scanner(System.in);

	public BTree() {
		// TODO Auto-generated constructor stub
		root = create(null, true);
	}

	private Node create(Node parent, boolean left) {
		if (parent == null) {
			System.out.println("root data is ?");

		} else if (left) {
			System.out.println("does left child exist of " + parent.data);
			boolean b = scn.nextBoolean();
			if (b == false) {
				return null;
			}
			System.out.println("left child data of " + parent.data + "?");
		} else {
			System.out.println("does right child exist of " + parent.data);
			boolean b = scn.nextBoolean();
			if (b == false) {
				return null;
			}
			System.out.println("right child data of " + parent.data + "?");
		}
		Node temp = new Node(scn.nextInt());
		temp.left = create(temp, true);
		temp.right = create(temp, false);

		return temp;
	}

	public int Size() {
		return Size(root);
	}

	private int Size(Node nn) {
		if (nn == null) {
			return 0;
		}

		int sp1 = Size(nn.left);
		int sp2 = Size(nn.right);

		return sp1 + sp2 + 1;
	}

	public int Max() {
		return Max(root);
	}

	private int Max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;

		}
		int sp1 = Max(nn.left);
		int sp2 = Max(nn.right);

		return Math.max(nn.data, Math.max(sp1, sp2));
	}
	public int find(int ali) {
		return find(root,ali);
	}
	private boolean find(Node nn, int ali) {
		if (nn == null) {
			return false;
		}
		if (nn.data == ali) {
			return true;
		}
		boolean L = find(nn.left, ali);
		boolean R = find(nn.right, ali);
		return L || R;

	}
	public int Ht() {
		return Ht(root);
	}
	private int Ht(Node nn) {
		int sp1 = Ht(nn.left);
		int sp2 = Ht(nn.right);

		return Math.max(sp1, sp2) + 1;

	}
}
