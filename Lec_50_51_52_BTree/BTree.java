package Lec_50_51_52_BTree;

import java.util.LinkedList;
import java.util.Queue;
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

	public boolean find(int ali) {
		return find(root, ali);
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
		if (nn == null) {
			return -1;
		}
		int sp1 = Ht(nn.left);
		int sp2 = Ht(nn.right);

		return Math.max(sp1, sp2) + 1;

	}

	public int Dia() {
		return Dia(root);
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int sp1 = Dia(nn.left);
		int sp2 = Dia(nn.right);
		int self = Ht(nn.left) + Ht(nn.right) + 2;
		return Math.max(self, Math.max(sp1, sp2));

	}

	public int Dia2() {
		return Dia2(root).Dia;
	}

	private DiaHt Dia2(Node nn) {
		if (nn == null) {
			return new DiaHt();
		}
		DiaHt sp1 = Dia2(nn.left);
		DiaHt sp2 = Dia2(nn.right);
		int self = sp1.Ht + sp2.Ht + 2;

		DiaHt ans = new DiaHt();
		ans.Dia = Math.max(self, Math.max(sp1.Ht, sp2.Ht));
		ans.Ht = Math.max(sp1.Ht, sp2.Ht) + 1;
		return ans;

	}

	class DiaHt {
		int Ht = -1;
		int Dia = 0;
	}

	public boolean isBal() {
		return isBal(root);
	}

	private boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean self = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;
		boolean sp1 = isBal(nn.left);
		boolean sp2 = isBal(nn.right);
		return sp1 && sp2 && self;

	}

	class isBalHt {
		boolean isBal = true;
		int Ht = -1;
	}

	public boolean isBal2() {
		return isBal2(root).isBal;
	}

	private isBalHt isBal2(Node nn) {
		if (nn == null) {
			return new isBalHt();
		}
		isBalHt sp1 = isBal2(nn.left);
		isBalHt sp2 = isBal2(nn.right);
		boolean self = Math.abs(sp1.Ht - sp2.Ht) <= 1;
		isBalHt ans = new isBalHt();
		ans.Ht = Math.max(sp1.Ht, sp2.Ht) + 1;
		ans.isBal = self && sp1.isBal && sp2.isBal;

		return ans;

	}

	public void lvlOrder() {
		Queue<Node> Q = new LinkedList<Node>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node curr = Q.poll();
			System.out.println(curr.data);
			if (curr.left != null) {
				Q.add(curr.left);
			}
			if (curr.right != null) {
				Q.add(curr.right);
			}
		}
	}
//	public boolean flipEquiv(TreeNode root1, TreeNode root2) {
//        if(root1==null && root2==null){
//            return true;
//        }
//        if(root1==null||root2==null){
//            return false;
//        }
//        if(root1.val!=root2.val){
//            return false;
//        }
//        boolean noflip =flipEquiv(root1.left,root2.left) &&flipEquiv(root1.right,root2.right);
//        boolean flip =flipEquiv(root1.left,root2.right) &&flipEquiv(root1.right,root2.left);
//        return noflip || flip;
//    }
//	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root==null){
//            return null;
//        }
//        if(root==p||root==q){
//            return root;
//        }
//        TreeNode L = lowestCommonAncestor(root.left, p, q);
//        TreeNode R = lowestCommonAncestor(root.right, p, q);
//        if(L!=null && R!=null) {
//        	return root;
//        }
//        if(L!=null && R==null) {
//        	return L;
//        }
//        if(L==null && R!=null) {
//        	return R;
//        }
//        return null;
//    }

}
