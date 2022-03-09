package Lec_19;

public class String_Plain_SS {
	public static void main(String[] args) {
		func("tiittiit");
	}

	public static void func(String str) {
		for (int c = 0; c < str.length(); c++) {
			for (int rad = 0; c - rad >= 0 && c + rad < str.length(); rad++) {
				
				char ch_L = str.charAt(c - rad);
				char ch_R = str.charAt(c + rad);
				if (ch_L == ch_R) {
//					is a pilindrome!!
					System.out.println(str.substring(c - rad, c + rad + 1));
				} else {
					break;
				}
			}
		}
		for (double c = 0.5; c < str.length(); c++) {
			for (double rad = 0.5; c - rad >= 0 && c + rad < str.length(); rad++) {
				
				char ch_L = str.charAt((int)(c - rad));
				char ch_R = str.charAt((int)(c + rad));
				if (ch_L == ch_R) {
//					is a pilindrome!!
					System.out.println(str.substring((int)(c - rad), (int)(c + rad + 1)));
				} else {
					break;
				}
			}
		}
	}
}
