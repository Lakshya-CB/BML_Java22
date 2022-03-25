package Lec_20;

public class String_demo {
	public static void main(String[] args) {
		String str00 = "the";
		String str01 = "the";
		String str02 = "the";
		String str03 = "the";
		String str04 = "the";
		str01 = str01 + "op"; // immutability!! changes are created at a new address!!

		System.out.println(str01 == str00);
		System.out.println(str01);
		System.out.println(str00);

//		String str111 = new String ("the");

	}

}
