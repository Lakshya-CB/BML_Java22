package Lec_54_BST;

public class BST {
	class Node {
		public Node(int dd) {
			// TODO Auto-generated constructor stub
			data = dd;
		}

		int data;
		Node left;
		Node right;
	}

	public BST(int[] in) {
		root = create(in, 0, in.length - 1);
	}

	private Node create(int[] in, int s, int e) {
		if (s > e) {
			return null;
		}
		int mid = (s + e) / 2;
		Node nn = new Node(in[mid]);
		nn.left = create(in, s, mid - 1);
		nn.right = create(in, mid + 1, e);

		return nn;
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

	private void disp_in(Node nn) {
		if (nn == null) {
			return;
		}
//		LSR
		disp_in(nn.left);
		System.out.println(nn.data);
		disp_in(nn.right);
	}

	public void disp_in() {
		disp_in(root);
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
		} else if (nn.data > ali) {
			return find(nn.left, ali);
		} else {
			return find(nn.right, ali);
		}
	}

	public void Add(int ali) {
		root = Add(root, ali);
	}

	private Node Add(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (nn.data >= ali) {
			nn.left = Add(nn.left, ali);
		} else {
			nn.right = Add(nn.right, ali);
		}
		return nn;
	}

	public int Max() {
		return Max(root);

	}

	private int Max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		if (nn.right == null) {
			return nn.data;
		}
		return Max(nn.right);
	}

	public void Remove(int ali) {
		root = Remove(root, ali);
	}

	private Node Remove(Node nn, int ali) {
		if (nn == null) {
			return null;
		}

		if (nn.data > ali) {
			nn.left = Remove(nn.left, ali);
		} else if (nn.data < ali) {
			nn.right = Remove(nn.right, ali);
		} else {
//			case 1!!
//			nn is leaf node!!
			if (nn.left == null && nn.right == null) {
				return null;
			}
//			case 2!!
//			nn only has a left child
			if (nn.left != null && nn.right == null) {
				return nn.left;
			}
//			nn only has a right child 
			if (nn.left == null && nn.right != null) {
				return nn.right;
			}
//			case 3!!
			if (nn.left != null && nn.right != null) {
//				swap nn.data with the max of left
				nn.data = Max(nn.left);
				nn.left = Remove(nn.left, nn.data);

				return nn;
			}
		}
		return nn;
	}
}
