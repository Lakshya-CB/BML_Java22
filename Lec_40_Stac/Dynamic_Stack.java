package Lec_40_Stac;

import Lec_38.Stack;

public class Dynamic_Stack extends Stack {
	@Override
	public void add(int ali) {
		if (this.isFull()) {
			int[] big = new int[this.arr.length * 2];
			int idx = 0;
			while (idx <= tos) {
				big[idx] = this.arr[idx];
				idx++;
			}
			this.arr = big;
		}
		super.add(ali);
	}
}
