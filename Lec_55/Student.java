package Lec_55;

public class Student implements Comparable<Student> {
	int age;
	String name;

	public Student(int a, String n) {
		// TODO Auto-generated constructor stub
		age = a;
		name = n;
	}

	@Override
	public int compareTo(Student o) {
//		a.compareTo(b)
//		this= a and o = b

		return this.age - o.age;
	}

	@Override
	public String toString() {
		return this.name + " , " + this.age;
	}
}
