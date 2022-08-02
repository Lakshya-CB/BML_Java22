package Lec_57;

import java.util.ArrayList;

public class PriorityQ {
	ArrayList<Integer> AL;

	public PriorityQ() {
		// TODO Auto-generated constructor stub
		AL = new ArrayList<>();
	}

	public int Size() {
		return AL.size();
	}

	public boolean isEmpty() {
		return AL.isEmpty();
	}

	public int peek() {
		return AL.get(0);
	}

	public void add(int ali) {
		AL.add(ali);// CBT!!
		Upheapify(AL.size() - 1);
	}

	private void Upheapify(int ch) {
		int p = (ch - 1) / 2;
		if (AL.get(p) > AL.get(ch)) {
//			swap!!(p ans ch)
			swap(ch, p);
			Upheapify(p);
		}
	}

	private void swap(int i, int j) {
		int temp = AL.get(i);
		AL.set(i, AL.get(j));
		AL.set(j, temp);
	}

	public int poll() {
		int ans = AL.get(0);
		int last = AL.remove(AL.size() - 1);
		
		if(AL.size()==0) {
			return ans;
		}
		AL.set(0, last);
		DownHeapify(0);
		return ans;
	}

	private void DownHeapify(int p) {
		int L = 2 * p + 1;
		int R = 2 * p + 2;

		int min = p;
		if (L < AL.size() && AL.get(min) > AL.get(L)) {
			min = L;
		}
		if (R < AL.size() && AL.get(min) > AL.get(R)) {
			min = R;
		}
		if(min!=p) {
			swap(min, p);
			DownHeapify(min);
		}
	}
}
