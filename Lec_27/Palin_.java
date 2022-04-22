package Lec_27;

import java.util.ArrayList;
import java.util.List;

public class Palin_ {
	public static void main(String[] args) {
		List<String> parts = new ArrayList<>();
		Partition("nitin", parts);
	}

	public static void Partition(String str, List<String> parts) {
		if (str.isEmpty()) {
			System.out.println(parts);
		}
		for (int len = 1; len <= str.length(); len++) { // str = nitin
			String chopped = str.substring(0, len); // chopped = n
			String remain = str.substring(len); // remaining= itin

			parts.add(chopped);
			Partition(remain, parts);

//			System.out.println(chopped + " || "+remain );
//			Partition(remain, parts+chopped + " ",parts);
		}
	}
}
