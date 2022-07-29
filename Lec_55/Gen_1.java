package Lec_55;

import java.awt.DisplayMode;
import java.util.Comparator;

public class Gen_1 {
	static class StudentNameComp implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
//			o1-o2;
			// TODO Auto-generated method stub
			return (o1.name).compareTo(o2.name);
		}

	}
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		Integer[] arr2 = new Integer[5];
//		System.out.println(arr2[0]);

		Student[] arr = new Student[5];
		arr[4] = new Student(1, "A091");
		arr[3] = new Student(2, "A131");
		arr[2] = new Student(3, "A908");
		arr[1] = new Student(4, "A008");
		arr[0] = new Student(5, "A0109");

//		Sort(arr);

		Sort(arr,new StudentNameComp());
		Disp(arr);
	}

	// function !! generic!!Object[] arr
	public static <ToT> void Disp(ToT[] arr) {
		for (ToT o : arr) {
			System.out.println(o);
		}
	}

//	public static void Disp(Object[] arr) {
//		for (Object o : arr) {
//			System.out.println(o);
//		}
//	}

	public static <TII extends Comparable> void Sort(TII[] arr) {
		for (int count = 0; count < arr.length; count++) {
			for (int i = 0; i < arr.length - 1; i++) {
//			i and i+1
//				arr[i].
//				if (arr[i] > arr[i + 1]) {//
//				if (arr[i] - arr[i + 1]>0) {//
				if (arr[i].compareTo(arr[i + 1]) > 0) {
//				compare object arr[i] and arr[i+1]
//				swap!!
					TII temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	

	public static <TII> void Sort(TII[] arr, Comparator<TII> obj) {
		for (int count = 0; count < arr.length; count++) {
			for (int i = 0; i < arr.length - 1; i++) {
//			i and i+1
//				arr[i].
//				if (arr[i] > arr[i + 1]) {//
//				if (arr[i] - arr[i + 1]>0) {//

				if (obj.compare(arr[i], arr[i + 1]) > 0) {
//				compare object arr[i] and arr[i+1]
//				swap!!
					TII temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
