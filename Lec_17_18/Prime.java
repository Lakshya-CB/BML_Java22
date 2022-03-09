package Lec_17_18;

import java.util.Arrays;

public class Prime {
	public static void main(String[] args) {
		sieve_of_eratosthenes(1000);
	}

	public static void pp(int n) {
		for (int num = 2; num <= n; num++) {
			int count = 0;
			for (int fact = 1; fact <= num; fact++) {
				if (num % fact == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(num);
			}
		}
	}

	public static void sieve_of_eratosthenes(int n) {
		boolean prime[] = new boolean[n + 1];

		Arrays.fill(prime, true);

		for (int fact = 2; fact * fact <= n; fact++) {
//			start the table of fact!!
//			start from fact*2!! 
//			O(nlog(log(n)));
			if (prime[fact]) {
				for (int table = 2 * fact; table <= n; table = table + fact) {
					prime[table] = false;
				}
			}
		}
		for(int num = 2;num<=n;num++) {
			if(prime[num]) {
				System.out.println(num);
			}
		}
	}
}
