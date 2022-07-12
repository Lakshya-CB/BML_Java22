package Lec_47_48_LL;

import java.util.Stack;

public class LinkedList {
	class Node {
		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public void disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int size = 0;
		Node temp = head;
		while (temp != null) {
//			System.out.println(temp.data);
			temp = temp.next;
			size++;
		}
		return size;
	}

	public int getFrist() {
		if (head == null) {
			throw new RuntimeException("LL is empty");
		}
		return head.data;
	}

	public int getLast() {
		if (head == null) {
			throw new RuntimeException("LL is empty");
		}
		Node temp = head;
		while (temp.next != null) {
//			System.out.println(temp.data);
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getLastNode() {
		if (head == null) {
			throw new RuntimeException("LL is empty");
		}
		Node temp = head;
		while (temp.next != null) {
//			System.out.println(temp.data);
			temp = temp.next;
		}
		return temp;
	}

	public int getIdx(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("Indx out of bounds");
		}
		Node temp = head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getIdxNode(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("Indx out of bounds");
		}
		Node temp = head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addLast(int ali) {
		Node nn = new Node(ali);
		if (head == null) {
			head = nn;
			return;
		}
		Node last = getLastNode();
		last.next = nn;
	}

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void addAt(int idx, int ali) {
		if (idx == 0) {
			addFirst(ali);
		} else if (idx == size()) {
			addLast(ali);
		} else if (idx > size()) {
			throw new RuntimeException("invalid idx");
		} else {
			Node nn = new Node(ali);
			Node prev = getIdxNode(idx - 1);

			Node curr = prev.next;// 30k!!
			prev.next = nn;
			nn.next = curr;
		}
	}

	public int removeFirst() {
		if (head == null) {
			throw new RuntimeException("LL EMpty");
		}
		Node temp = head;
		head = head.next;
		return temp.data;
	}

	public int removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();
		}
		if (idx >= size() || idx < 0) {
			throw new RuntimeException("invalid idx");
		}
		Node prev = getIdxNode(idx - 1);
		Node curr = prev.next;
		Node ahead = curr.next;
		prev.next = ahead;
//		prev.next = prev.next.next;
		return curr.data;
	}

	public void Rev() {
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;
		}
		head = prev;
	}

	public void Rev2() {
		Node temp = head;
		Rev2(temp);
		temp.next = null;
	}

	private void Rev2(Node temp) {
		if (temp.next == null) {
			head = temp;
			return;
		}
		Rev2(temp.next);
		Node prev = temp;
		Node curr = temp.next;
		curr.next = prev;

	}

	public int midAli() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
//			while ( fast.next != null && fast != null ) {

			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int kthDisLast(int k) {
		Node ahead = head;
		while (k > 0) {
			ahead = ahead.next;
			k--;
		}
		Node behind = head;
		while(ahead!=null) {
			ahead = ahead.next;
			behind = behind.next;
		}
		return behind.data;
	}
	public void KRev(int k) {
		Stack<Node> S = new Stack<>();
		Node LastNode = null;
		Node FirstNode = null;
		
		Node temp = head;
		while(temp!=null) {
			Node ahead = temp.next;
			if(S.size()==k) {
				while(!S.isEmpty()) {
					Node nn = S.pop();
//					add this node at the ending of a new Linked LIst
					if(LastNode==null) {
						FirstNode =nn;
						LastNode=nn;
					}else {
						LastNode.next = nn;
						LastNode = nn;
					}
				}
			}
			
			S.add(temp);
			temp= ahead;// dangerous!!
		}
		while(!S.isEmpty()) {
			Node nn = S.pop();
//			add this node at the ending of a new Linked LIst
			if(LastNode==null) {
				LastNode=nn;
			}else {
				LastNode.next = nn;
				LastNode = nn;
			}
		}
		LastNode.next = null;
		head = FirstNode;
	}
}
