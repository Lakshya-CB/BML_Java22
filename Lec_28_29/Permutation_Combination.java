package Lec_28_29;

public class Permutation_Combination {
	public static void main(String[] args) {
		int total = 4;
		boolean[] selected = new boolean[total];
//		perm(3, total, "", selected);
		comb(2, total, "", -1);

	}

	public static void perm(int toSelect, int total, String ans, boolean[] selected) {
		if (toSelect == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < total; i++) {
//			select box ith
			if (selected[i] == false) { // ith box is not selected !!
				selected[i] = true; // prep!!
				perm(toSelect - 1, total, ans + "b" + i, selected);
				selected[i] = false; // undo prep!!

			}
		}
	}

	public static void comb(int toSelect, int total, String ans, int last_box) {
		if (toSelect == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = last_box + 1; i < total; i++) {
//			select box ith
			comb(toSelect - 1, total, ans + "b" + i, i);

		}
	}
}
