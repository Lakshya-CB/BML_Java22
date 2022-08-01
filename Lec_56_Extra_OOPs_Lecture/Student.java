package Lec_56_Extra_OOPs_Lecture;

public class Student {
	class book{
		int pages;
	}
	int Age;
	final String Name;
	static int Total_st=100;
	public Student() {
//		book b = new book();
		// TODO Auto-generated constructor stub
		Total_st=1092;
		Name = "LOL";
	}
	public Student(String N) {
		Name = N;
	}
	public static int getTotal() {

//		book b = new book();
//		System.out.println(this);
	
		return Total_st;
	}
	public void Intro() {
		System.out.println(this.Age+"  ");
	}
}
