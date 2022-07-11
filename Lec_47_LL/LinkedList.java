package Lec_47_LL;

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
			System.out.print(temp.data+" ");
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
		if (idx<0||idx >= size()) {
			throw new RuntimeException("Indx out of bounds");
		}
		Node temp = head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getIdxNode(int idx) {
		if (idx<0||idx >= size()) {
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
		if(head==null) {
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
		if(head==null) {
			throw new RuntimeException("LL EMpty");
		}
		Node temp = head;
		head = head.next;
		return temp.data;
	}
	public int removeAt(int idx) {
		if(idx==0) {
			return removeFirst();
		}
		if(idx>=size()||idx<0) {
			throw new RuntimeException("invalid idx");
		}
		Node prev = getIdxNode(idx-1);
		Node curr = prev.next;
		Node ahead = curr.next;
		prev.next = ahead;
//		prev.next = prev.next.next;
	}
}
