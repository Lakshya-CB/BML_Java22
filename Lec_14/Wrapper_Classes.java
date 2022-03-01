package Lec_14;

public class Wrapper_Classes {
	public static void main(String[] args) {
		byte b = 1; // fn frame!!
		Byte B = 1; // heap!!

		short s = 10;
		Short S = 10;

		int i = 20;
		Integer I = 20;

		long l = 200;
		Long L = 200L;

		char ch = '1';
		Character CH = '2';

		System.out.println(i);
		System.out.println(I);

//		What is Happening?! Unboxing!!
		i = I;

//		What is Happening!!  Auto-Boxing!! or Boxing!!
		I = i;
		
	}
}
