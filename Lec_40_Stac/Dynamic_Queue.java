package Lec_40_Stac;

import Lec_38.Queue;

public class Dynamic_Queue extends Queue {
	@Override
	public void add(int ali) {
		if (this.isFull()) {
			int[] big = new int[this.arr.length * 2];
			int idx = 0;
			while (idx < this.size) {
				big[idx] = this.arr[(s + idx) % this.arr.length];
				idx++;
			}
			this.s = 0;
			this.arr = big;
		}
		super.add(ali);
	}
}
