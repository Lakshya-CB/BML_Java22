package Implementation_HM;

public class demo_2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("A", 11);
		map.put("A2", 12);
		map.put("A3", 13);
		map.put("A4", 14);
		map.put("A1", 11);
		map.put("A12", 12);
		map.put("A13", 13);
		map.put("A14", 14);
		map.put("A15", 15);
		
		System.out.println(map);
		System.out.println(map.get("A3"));
	}
}
