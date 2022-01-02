package Lec_2;

public class HCF {
	public static void main(String[] args) {
		int a = 18;
		int b = 18;

		int divisor = a;
		int dividend = b;

		while (divisor!=0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(dividend);
	}
}
