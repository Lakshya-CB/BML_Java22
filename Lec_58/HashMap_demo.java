package Lec_58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {
	public static void main(String[] args) {
		HashMap<String, Integer> HM = new HashMap<String, Integer>();
		HM.put("0AZZ", 100); // O(1)
		HM.put("B00", 100);
		HM.put("C12", 99);
		HM.put("D", 80);
		System.out.println(HM);

		System.out.println(HM.get("C"));// O(1)
		System.out.println(HM.size());

		HM.put("D", 800); // Keys are unique!!
//		Key already exists , update that pair!!

		System.out.println(HM);

		System.out.println(HM.containsKey("PP"));// O(1)
		int val = HM.remove("D");
		System.out.println(val + "-" + HM);

		System.out.println(HM.keySet());
		Set<String> Keys = HM.keySet();
		System.out.println(Keys);
		for(String Key : HM.keySet()) {
			System.out.println(Key);
		}
		ArrayList<String> Al = new ArrayList<>(HM.keySet());
		System.out.println(Al);
	}
}
