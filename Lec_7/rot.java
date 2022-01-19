package Lec_7;

public class rot {
	public static void main(String[] args) {
		int n = 123456;
		int rot = 4;
		int nod = 0;

//		 backup!!
		int num = n;
		while (n > 0) {
			n = n / 10;
			nod++;
		}
// because of periodicity 
		rot = rot % nod;
		
		while (rot > 0) {
			int digit = num % 10;
			int part = num / 10;
//			System.out.println(digit + " __ " + part); 
			int power = (int) Math.pow(10, 5);
			num = digit * power + part;

			rot--;
		}
		System.out.println(num);
	}
}
