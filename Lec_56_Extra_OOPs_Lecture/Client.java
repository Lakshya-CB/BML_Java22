package Lec_56_Extra_OOPs_Lecture;

import Lec_56_Extra_OOPs_Lecture.Student.book;

public class Client {
	public static void main(String[] args) {
		System.out.println(Student.Total_st);
		System.out.println(Student.getTotal());
		Student s1 = new Student();
		System.out.println(Student.Total_st);
		Student s2 = new Student();
		System.out.println(Student.Total_st);

		book b = s1.new book();

	}
}
