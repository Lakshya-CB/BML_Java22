package Lec_7;

public class Rot_2 {
	public static void main(String[] args) {
		int n = 123456;
		int rot = 2;
		int nod = 0;

//		 backup!!
		int num = n;
		while (n > 0) {
			n = n / 10;
			nod++;
		}
// because of periodicity 
		rot = rot % nod;

		int power = (int) Math.pow(10, rot);
		int part1 = num / power;
		int part2 = num % power;
//		System.out.println(part1 + " __ " + part2);
		int mult = (int) Math.pow(10, nod - rot);
		int ans = part2 * mult + part1;
		System.out.println(ans);

	}
}
