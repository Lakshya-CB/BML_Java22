package Lec_25;

public class Letter_Key_Comb {
	public static void main(String[] args) {
		solve("23495", "");
	}

	public static void solve(String digits, String path) {
		if (digits.isEmpty()) {
			System.out.println(path);
			return;
		}
//		digits = "234"
		char ch = digits.charAt(0); // ch=2
		String options = map(ch); // options = "abc"
		for (int i = 0; i < options.length(); i++) {
//			sp => digits 34!!
			char ch_toAdd = options.charAt(i);
			solve(digits.substring(1), path + ch_toAdd);
		}
	}

	public static String map(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {
			return "def";
		} else if (ch == '4') {
			return "ghi";
		} else if (ch == '5') {
			return "jkl";
		} else if (ch == '6') {
			return "mno";
		} else if (ch == '7') {
			return "pqrs";
		} else if (ch == '8') {
			return "tuv";
		} else if (ch == '9') {
			return "wxyz";
		} else {
			return "";
		}
	}

}
