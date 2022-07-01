package Lec_39_Inheritance;

public class Client {
	public static void main(String[] args) {
//		C V2 = new C();
//		case 1
		P V1 = new P();
		System.out.println(V1.data); // var
		V1.fun();

		System.out.println("============");
// case :2
//		Compiler always looks at the
//		LHS!!!!!!!!!!
		P V2 = new C();
		System.out.println(V2.data_P);
		System.out.println(((C) V2).data_C);

		System.out.println(V2.data); // ?!
//		collision of variables are resolved by LHS
//		Type of address
		System.out.println(((C) V2).data); // ?!
		
		V2.fun_P();
		((C) V2).fun_C();

//		resolve collision of function		
//		USING RHS!!, single function
		V2.fun();
		((C) V2).fun();
//		Case 3:
		System.out.println("============");
		C obj3 = new C();
		System.out.println(obj3.data);
		System.out.println(((P) obj3).data);

		obj3.fun();
		((P) obj3).fun();
//		case 4
//		C obj4 = new P();
//		obj4.data_C = 99;

		System.out.println("lol");
		System.out.println(obj3);
		System.out.println(V1);
		
		Object obj = new C();
		System.out.println(obj);
		
		
	}
}
