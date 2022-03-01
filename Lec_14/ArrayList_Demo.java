package Lec_14;

import java.util.ArrayList;

public class ArrayList_Demo {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		System.out.println(AL);
//		Size!?!
		System.out.println(AL.size());
//		Add?! is ADD At AL.size() index or at the end!!
		// RAnge of index is 0 to AL.size()
		AL.add(10);
		AL.add(20);
		AL.add(30);
		System.out.println(AL);
		AL.add(1, 5);
		System.out.println(AL);
		AL.add(AL.size(), 100);
		System.out.println(AL);
//		How to get info at index i, arr[i];
		System.out.println(AL.get(AL.size()-1));
//		Set!
		AL.set(2, 99);
		System.out.println(AL);
		
//		Remove function!!
		System.out.println(AL.remove(1));
		System.out.println(AL);
		
//		Enchanced??!
		for(int i : AL) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
}
