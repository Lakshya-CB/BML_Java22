package Lec_35_OOPs;

public class Client {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		System.out.println(s.Age);
		System.out.println(s.Name);

		Student s1 = s;
		
		s.Age = 9;
		s.Name = "gugu";

		s1 = new Student(); 
		// new instance , new object from class Student
		// new proper noun , from a noun which is Student
		System.out.println(s1.Age);
		System.out.println(s1.Name);
		
		System.out.println(s1==s);
	}
}
