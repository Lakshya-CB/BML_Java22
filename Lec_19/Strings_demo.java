package Lec_19;

public class Strings_demo {
	public static void main(String[] args) {
//		Inside Heap and Inside IP
		String str = "Hello"; // Literal way!!
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = "Hello";
		String str5 = "Hello";
		String str6 = "Hello";

//		System.out.println(str == str6);

//		Inside Heap but outside IP		
		String SS = new String("Hello"); // new keyword!!!! // Created outside the Intern Pool!!

		// If Strings were Immutable!!
		str1 = "YA BOII";// CANNOT Change the string at the same address!!
//		str1 becomes a new adress!! 20k;

		System.out.println(str == str1);
		System.out.println(str);
		System.out.println(str1);

//		Complexity!!
		System.out.println(str.length()); // O(1)!!
		System.out.println(str.charAt(2)); // O(1)!!

//		System.out.println(str.substring(1, 4)); //O(n) !! new keyword!! Outside IP!!
		String POP = str.substring(1, 4);
		POP.intern(); // to send something in the internpool!!
		System.out.println(POP);
		String POP2 = "ell";
		System.out.println(POP + "__" + POP2);
		System.out.println(POP2 == POP);

		System.out.println(str.indexOf('l')); // O(n)!!
		System.out.println(str.lastIndexOf('l')); // O(n)!!

		str = str + 2;

	}
}
