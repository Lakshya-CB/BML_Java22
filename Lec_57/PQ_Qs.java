package Lec_57;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_Qs {
	public static void main(String[] args) {

//		int[] arr = { 20, 30, 60, 50, 10, 55, 57, 40 };
//		topKElements(arr, 3);
		int[][] arr = { { 10, 20, 30 }, { 15, 35 }, { 5, 7, 12, 25 }, { 17, 22, 40 } };
		mergeKsorted(arr);
	}

	public static void topKElements(int[] arr, int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
//		PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
		for (int ali : arr) {
			PQ.add(ali);
			if (PQ.size() == k + 1) {
				PQ.poll();
			}
		}
		System.out.println(PQ);

	}

	static class Node implements Comparable<Node> {
		public Node(int row_idx, int i, int j) {
			// TODO Auto-generated constructor stub
			arridx = row_idx;
			dataidx = i;
			data = j;
		}

		int arridx;
		int dataidx;
		int data;

		@Override
		public int compareTo(Node o) {
//			this-o
			// TODO Auto-generated method stub
			return this.data - o.data;
		}

	}

	public static void mergeKsorted(int[][] mat) {
		PriorityQueue<Node> PQ = new PriorityQueue<>();
		int row_idx = 0;
		for (int[] row : mat) {
			Node nn = new Node(row_idx, 0, row[0]);
			row_idx++;
			PQ.add(nn);
		}
		while (!PQ.isEmpty()) {
			Node curr = PQ.poll();
			System.out.println(curr.data);
			if (curr.dataidx + 1 < mat[curr.arridx].length) {
				curr.dataidx = curr.dataidx + 1;
				curr.data = mat[curr.arridx][curr.dataidx];

				PQ.add(curr);
			}
		}
	}
}
