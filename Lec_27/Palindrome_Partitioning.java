package Lec_27;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
	public static void main(String[] args) {
		List<String> Part_AL = new ArrayList<String>();
		Partition("aabbaa", "", Part_AL);
//		System.out.println(Part_AL);
	}

	public static void Partition(String str, String partitions, List<String> Part_AL) {
		if (str.isEmpty()) {
			System.out.println(partitions+" = > "+Part_AL);
		}
		for (int len = 1; len <= str.length(); len++) {
			String chopped = str.substring(0, len);
			if (isPalin(chopped)) {
				String remain = str.substring(len);
//			System.out.println(chopped + " : "+remain);
//			Method : 1 , make list behave like an immutable string , 
//			that means concatenation gives me a new address
//			List<String> copy = new ArrayList<>(Part_AL);
//			copy.add(chopped);
//			Partition(remain, partitions+ "|"+chopped,copy);
				Part_AL.add(chopped); // Prep for my recursive call
				Partition(remain, partitions + "|" + chopped, Part_AL);
				Part_AL.remove(Part_AL.size() - 1); // Undo the prep
			}
		}
	}

	private static boolean isPalin(String chopped) {
		// TODO Auto-generated method stub
		int s = 0;
		int e = chopped.length()-1;
		while(s<e) {
			if(chopped.charAt(s)!=chopped.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

}
