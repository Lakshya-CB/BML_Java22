package Lec_3;

public class Pat_2 {
	public static void main(String[] args) {
		int n = 7;

		int row = 1;
		int nst = 1;
		
		while (row <= n) {
			
			int cst = 1; // cst is current star!!
//			nst is number of star in each row!!
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

//			prep section for the next row!!
			row++;
			System.out.println();
			nst++;
		}
	}
}
