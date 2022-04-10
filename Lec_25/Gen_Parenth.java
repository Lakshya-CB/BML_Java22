package Lec_25;

import java.util.ArrayList;
import java.util.List;

public class Gen_Parenth {
	public static void main(String[] args) {
		List<String> AL = new ArrayList<String>();
		gen(3, 3, "");
	}

	public static void gen(int open, int close, String path) {
//		open => number of( remaining!!
//		close => number of ) remaining
		if(open > close) { // -ve BC!!
//			this mean brotherrrrrrrrrrr that you have used more closing brackets!!
//			before oprning the pair of parenthesis !!
			return;
		}
		
		if (open == close && open == 0) {
			System.out.println(path);
			return;
		}
		if (open > 0) {
			gen(open - 1, close, path + "(");
		}
		if (close > 0) {
			gen(open, close - 1, path + ")");
		}
	}
}
