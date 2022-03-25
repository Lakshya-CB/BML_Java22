package Lec_20;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "hello";
		StringBuilder sb = new StringBuilder(str); // Muttable arrayList!!

		System.out.println(sb);
		System.out.println(str);
//		char At!!
		System.out.println(str.charAt(str.length() - 1));
		System.out.println(sb.charAt(sb.length() - 1));
//		substring!!
		System.out.println(str.substring(1, 3));
		System.out.println(sb.substring(1, 3));
//		add?!!
		str = str + 'P'; // O(n)
		sb.append('P'); // O(1)
		System.out.println(str);
		System.out.println(sb);
//		Insert?! at index 3 // O(n)
		str = str.substring(0, 3) + 'Y' + str.substring(3);
		sb.insert(3, 'Y');
		System.out.println(str);
		System.out.println(sb);

//		deletion!! at index 3 O(n);
		str = str.substring(0, 3) + str.substring(4);
		sb.deleteCharAt(3);
		System.out.println(str);
		System.out.println(sb);
//		Update the 3rd char to X!! 
		str = str.substring(0, 3) + 'X' + str.substring(4); // O(n);
		sb.setCharAt(3, 'X'); // O(1)
		System.out.println(str);
		System.out.println(sb);

		String ans = sb.toString();
		System.out.println(ans);
		System.out.println("============================");

		long start = System.currentTimeMillis();
		String str01 = new String("");
		StringBuilder sb01 = new StringBuilder(str01);
		int n = 100000;
		for (int ll = 0; ll <= n; ll++) {
			sb01.append(ll);// O(n)!!!
		}
		String ans01 = sb.toString();
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0);
		
	}
	public static String fn(String str, int n) {
		long start = System.currentTimeMillis();
		String str01 = new String(str);
		StringBuilder sb01 = new StringBuilder(str01);
		for (int ll = 0; ll <= n; ll++) {
			sb01.append(ll);// O(n)!!!
		}
		String ans01 = sb01.toString();
		return ans01;
		
	}
}
