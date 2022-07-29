package Lec_55;

public class Client {
public static void main(String[] args) {
	LinkedList<Student> LL= new LinkedList<Student>();
	LL.addLast(new Student(1,"A"));
	LL.addLast(new Student(1,"B"));
	LL.addLast(new Student(1,"C"));
	LL.addLast(new Student(1,"D"));
	LL.addLast(new Student(1,"E"));
	LL.disp();
	
}
}
