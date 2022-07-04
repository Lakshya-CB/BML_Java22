package Lec_41;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
//		System.out.println(Q);
		print_rev(Q);
		System.out.println(Q);
	}
	public static void Q_rev(Queue<Integer>Q) {
		if(Q.isEmpty()) {
			return;
		}
		int ali = Q.poll();
		
		Q_rev(Q);
		System.out.println(ali);
		Q.add(ali);
	}
	public static void print_rev(Queue<Integer>Q, int c) {
		if(c==Q.size()) {
			return;
		}
		int ali = Q.poll();
		Q.add(ali);
		print_rev(Q,c+1);
		System.out.println(ali);
		
	}
}
