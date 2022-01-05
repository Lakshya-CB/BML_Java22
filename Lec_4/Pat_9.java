package Lec_4;

public class Pat_9 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;

		int nsp = n - 1;
		int nst = 1;
		int num_row = 1;

		while (row <= n) {
//	print space!!
			int csp = 1;// current space!!
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
//	print star!!
			int num = num_row;
			int cst = 1;
			while (cst <= nst) {
				System.out.print(num + "\t");
				cst++;
				if (cst > nst / 2+1) {
					num--;
				} else {
					num++;
				}
			}

			row++;
			System.out.println();
//			num++;
			num_row++;
			nsp--;
			nst = nst + 2;
		}
	}
}
