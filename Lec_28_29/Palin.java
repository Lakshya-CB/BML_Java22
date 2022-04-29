package Lec_28_29;

import java.util.ArrayList;
import java.util.List;

public class Palin {
	public static void main(String[] args) {
		List<List<String>>   All_ans = new ArrayList<List<String>>();
		List<String> AL = new ArrayList<>();
		Partition("AAA", "", AL, All_ans);
		System.out.println(All_ans);
	}

	public static void Partition(String str, String parts , List<String> AL,List<List<String>>   All_ans) {
//		String are immutable and non primitve!!
		if (str.isEmpty()) {
//			System.out.println(parts);
//			System.out.println(AL + " | "+parts);
//			All_ans.add(new ArrayList<>(AL));
			ArrayList<String> copy = new ArrayList<>(AL);
			All_ans.add(copy);
		}
		for (int len = 1; len <= str.length(); len++) { // str = nitin
			String chopped = str.substring(0, len); // chopped = n
			if (isPlain(chopped)) {
				String remain = str.substring(len); // remaining= itin

				AL.add(chopped); // prep !! 
				Partition(remain, parts + " " + chopped, AL,All_ans);
				AL.remove(AL.size()-1); // undoing!! Explicit !! for AL
			}
		}
	}

	private static boolean isPlain(String chopped) {
		// TODO Auto-generated method stub
		int s = 0;
		int e = chopped.length() - 1;
		while (s < e) {
			if (chopped.charAt(s) != chopped.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
