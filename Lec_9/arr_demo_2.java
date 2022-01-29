package Lec_9;

public class arr_demo_2 {
	public static void main(String[] args) {
		char[] arr = new char[5];
		System.out.println("asdas");
//		System.out.println(arr); Special something
//		arr[0] = 'a';
//		arr[1] = 'b';
//		arr[2] = 'c';
//		arr[3] = 'd';
		
		System.out.println(arr[4] + "??"); // TO FIGURE OUT THE DEFULT VALUE!
	
		
//		for (int idx = 0; idx < arr.length; idx++) {
//			arr[idx] = (char)('a'+idx);
//		}
		
		for(char ch : arr) {
			ch = 'x';
		}
		
//		Print
//		for (int idx = 0; idx < arr.length; idx++) {
//			System.out.print(arr[idx]+ ",");
//		}
//		System.out.println("END");
	}
}
