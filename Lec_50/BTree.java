package Lec_50;

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

//	public void disp(Node nn) {
//		if(nn==null) {
//			return;
//		}
//		System.out.println(nn.data);
//		disp(nn.left);
//		disp(nn.right);
//	}
	public void disp_pre(Node nn) {
		if (nn == null) {
			return;
		}
//		SLR
		System.out.println(nn.data);
		disp_pre(nn.left);
		disp_pre(nn.right);
	}

	public void disp_in(Node nn) {
		if (nn == null) {
			return;
		}
//		LSR
		disp_in(nn.left);
		System.out.println(nn.data);
		disp_in(nn.right);
	}

	public void disp_post(Node nn) {
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

	public Node create(Node parent, boolean left) {
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
}
