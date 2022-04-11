package Lec_24;

public class Coin_Toss {
	public static void main(String[] args) {
//		Toss(3, "");
//		Toss(4, "",false);
//		SubSeq("abc", "");
		SubSeqASCII("abc", "");
	}

	public static void Toss(int coins, String ans) {
		if (coins == 0) {
//			if(ans.indexOf("TT")==-1)
			System.out.println(ans);
			return;
		}
//	Aim is toss a single coin1!

//		case 1:  when the coin is Head!!
		Toss(coins - 1, ans + "X");
//		case 2: when the coin is tails!!
		Toss(coins - 1, ans + "X0X");
	}

	public static void Toss(int coins, String ans, boolean last_T) {
		if (coins == 0) {
//			if(ans.indexOf("TT")==-1)
			System.out.println(ans);
			return;
		}
//	Aim is toss a single coin1!

//		case 1:  when the coin is Head!!
		Toss(coins - 1, ans + "H", false);
//		case 2: when the coin is tails!!
		if (last_T == false) {
			Toss(coins - 1, ans + "T", true);
		}
	}

	public static void SubSeq(String str, String ans) {
		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
//		Including!!
		SubSeq(str.substring(1), ans + ch);

//		Excluding!!
		SubSeq(str.substring(1), ans);

	}
	public static void SubSeqASCII(String str, String ans) {
		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
//		Including!!
		SubSeqASCII(str.substring(1), ans + ch);

//		Excluding!!
		SubSeqASCII(str.substring(1), ans);
		
//		ASCII !!
		SubSeqASCII(str.substring(1), ans+((int)ch));
		

	}
}
