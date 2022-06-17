package Lec_35_OOPs;

public class demo_1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Age = 9;
		s1.Name = "gugu";
		Student s2 = new Student();
		s2.Age = 6;
		s2.Name = "pugu";

		System.out.println(s1.Name + " " + s2.Name);
		System.out.println(s1.Age + " " + s2.Age);
		Test2(s1, s2);
		System.out.println(s1.Name + " " + s2.Name);
		System.out.println(s1.Age + " " + s2.Age);

	}

	public static void Test2(Student s1, Student s2) {
		s2 = new Student(); //30k
		String temp_s = s1.Name;
		s1.Name = s2.Name;
		s2.Name = temp_s;

		
		int temp_i = s1.Age;
		s1.Age = s2.Age;
		s2.Age = temp_i;
	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}

}
