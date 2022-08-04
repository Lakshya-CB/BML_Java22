package Implementation_HM;

import java.util.HashMap;

public class demo_1 {
	public static void main(String[] args) {
		HashMap<String, Integer> Map = new HashMap<>();
		Map.put("A",10);
		Map.put("AB",12);
		Map.put("B2",10);
		Map.put("B2",100);
		
		Map.put("0B2",10);
		Map.put("0B20",10);
		System.out.println(Map);
		System.out.println(Map.get("B2"));
		System.out.println(Map.get("B12"));
		
		System.out.println(Map.remove("B2"));
		System.out.println(Map);
		
		
	}
}
