package Lec_6;

public class Data_type_demo {
	public static void main(String[] args) {
//		Default data Type of RHS Literal!! 
		int i = 1000000000;

		byte b = 10; // RHS default literal type is int!!
//		implicitly!! int is converted into byte!!

//		Case 1: RHS as more bits!!
		b = (byte) 642; // You are types casting!! int to byte!!
//		You are explicitly converting int to byte!!

		System.out.println(b);

//		Case 2 : RHS has less bits!
		int a = b; // implicit!!
		System.out.println(a);

		System.out.println("==============");
//		for(byte bb = 0;bb<128;bb++) {
//			System.out.println(bb);
//		}
		byte bb = 127;
		System.out.println(bb);
//		bb++; // Implicit type casting!!
		bb = (byte) (bb + 1);// Explicit type casting!!
		System.out.println(bb);

//		case 3:
		long l = 2000_0000_0000_00l;
		System.out.println(l);
		
		long lol = l * bb;
	}
}
