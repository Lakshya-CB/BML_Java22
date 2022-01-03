package Lec_3;

public class Patterns {
	public static void main(String[] args) {
		int n = 7;

//		Write the code of step one!!
		int row = 1;
		int nst = n;
		while (row <= n) {

//			The code of step 2, to print stars
//			you have to print nst number of stars in each row!!
			int cst = 1;
			while (cst <= nst) {
//				if (row == 1 || row == n || cst == 1 || cst == n) { //Parameter
				if (row == cst || row + cst == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cst++;
			}

			row++;
			System.out.println(); // ?? why bro?! beacause after printing
//			the cursor needs to be in the next line!!

		}
	}
}
