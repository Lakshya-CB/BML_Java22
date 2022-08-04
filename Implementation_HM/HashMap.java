package Implementation_HM;

import java.util.ArrayList;

public class HashMap {
	class Node {
		public Node(String k, Integer v) {
			// TODO Auto-generated constructor stub
			Key = k;
			Val = v;
		}

		String Key;
		Integer Val;
		Node next;
	}

	int size;
	ArrayList<Node> buckets;

	public HashMap() {
		// TODO Auto-generated constructor stub
		buckets = new ArrayList<Node>();
		for (int i = 0; i < 4; i++) {
			buckets.add(null);
		}
	}

	public void put(String K, Integer V) {
		int bucket_num = Hashfn(K);
		Node head = buckets.get(bucket_num);
		Node temp = head;
		while (temp != null) {
			if ((temp.Key).equals(K)) {
				temp.Val = V;
				return;
			}
			temp = temp.next;
		}
		size++;
		
		Node nn = new Node(K, V);
		nn.next = head;
		buckets.set(bucket_num, nn);

		double LF = (1.0 * size) / buckets.size();
		if (LF > 2) {
			rehash();
		}
	}

	private void rehash() {
		// TODO Auto-generated method stub
		ArrayList<Node> newBuckets = new ArrayList<Node>();
		for (int i = 0; i < buckets.size() * 2; i++) {
			newBuckets.add(null);
		}
		size = 0;
		ArrayList<Node> oldBuckets = buckets;
		buckets = newBuckets;
		for (Node head : oldBuckets) {
//			travel all the Nodes in the oldbucket
			Node temp = head;
			while (temp != null) {
				this.put(temp.Key, temp.Val);
				temp = temp.next;
			}
		}

	}

	public Integer get(String K) {
		int bucket_num = Hashfn(K);
		Node head = buckets.get(bucket_num);
		Node temp = head;
		while (temp != null) {
			if ((temp.Key).equals(K)) {
				return temp.Val;
			}
			temp = temp.next;
		}
		return null;
	}

	private int Hashfn(String K) {
		int num = K.hashCode();
		int ans = num % buckets.size();
		if (ans < 0) {
			ans = ans + buckets.size();
		}
		return ans;
	}

	public String toString() {
		String ans = "{";
		for (Node head : buckets) {
//			travel all the Nodes in the oldbucket
			Node temp = head;
			while (temp != null) {
				ans = ans + " (" + temp.Key + "," + temp.Val + ") ";
				temp = temp.next;
			}
		}
		ans = ans + "}";
		return ans;
	}
}
