package Lec_58;

import java.util.HashSet;

public class Client {
	public static void main(String[] args) {
		Graph G = new Graph(7);
		G.addEdge(1, 2, 10);
		G.addEdge(1, 4, 6);

		G.addEdge(3, 2, 2);
		G.addEdge(3, 4, 3);

		G.addEdge(4, 5, 12);

		G.addEdge(5, 6, 9);
		G.addEdge(5, 7, 14);

		G.addEdge(7, 6, 13);

		System.out.println(G.map);
		System.out.println(G.numOfEdges());
		G.removeEdge(4, 5);
		System.out.println(G.hasPath(1,7, new HashSet<>()));

	}
}
