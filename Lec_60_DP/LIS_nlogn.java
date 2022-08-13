package Lec_60_DP;

import java.util.ArrayList;

public class LIS_nlogn {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 30, 40, 50, 3, 7, 11, 15, 16, 101, 18 };
		longest(arr);
	}

	public static int longest(int[] arr) {
		ArrayList<Integer> AL = new ArrayList<>();
		for (int ali : arr) {
			int idx = BS(AL, ali);
			if (idx == AL.size()) {
				AL.add(ali);
			} else {
				AL.set(idx, ali);
			}
			System.out.println(AL);
		}
		
		return AL.size();
	}

	public static int BS(ArrayList<Integer> AL, int ali) {
		int ans = AL.size();
		int s = 0;
		int e = AL.size() - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (AL.get(mid) >= ali) {
				ans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}
}
