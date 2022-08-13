package Lec_58;

import java.util.HashMap;

public class HashMap_QPS {
	public static void main(String[] args) {
		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };

		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
//		Inter(arr1, arr2);
		int[] arr00 = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		longestConsSeq(arr00);
	}

	public static void Inter(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> Map = new HashMap<Integer, Integer>();
		for (int ali : arr1) {
			if (Map.containsKey(ali)) {
				int freq = Map.get(ali);
				Map.put(ali, freq + 1);
			} else {
				Map.put(ali, 1);
			}
		}
		System.out.println(Map);
		for (int ali : arr2) {
			if (Map.containsKey(ali) && Map.get(ali) > 0) {
				System.out.println(ali);
				int freq = Map.get(ali);
				Map.put(ali, freq - 1);
			}
		}
	}
	public static void longestConsSeq(int[] arr) {
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int ali:arr) {
			if(map.containsKey(ali-1)) {
				map.put(ali, false);
			}else {
				map.put(ali, true);	
			}
			if(map.containsKey(ali+1)) {
				map.put(ali+1, false);
			}
		}
		System.out.println(map);
		for(int Key : map.keySet()) {
			if(map.get(Key)) {
				int temp = Key;
				while(map.containsKey(temp)) {
					System.out.print(temp+" ");
					temp = temp+1;
				}
				System.out.println();
			}
		}
	}
}
