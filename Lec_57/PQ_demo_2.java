package Lec_57;

public class PQ_demo_2 {
	public static void main(String[] args) {
		PriorityQ PQ = new PriorityQ();
		PQ.add(110);
		PQ.add(11);
		PQ.add(60);
		PQ.add(5);
		PQ.add(8);
		System.out.println(PQ.AL);
		
		System.out.println(PQ.poll());
		System.out.println(PQ.AL);
		
		System.out.println(PQ.poll());
		System.out.println(PQ.AL);
		
		System.out.println(PQ.poll());
		System.out.println(PQ.AL);
		
		System.out.println(PQ.poll());
		System.out.println(PQ.AL);
		
		System.out.println(PQ.poll());
		System.out.println(PQ.AL);
		
	}
}
