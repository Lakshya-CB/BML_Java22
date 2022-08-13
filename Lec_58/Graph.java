package Lec_58;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
//HashMap<V1,Nbrs>
//	HashMap<V1,HashMap<V2,Edge_wt>>
	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Graph(int V) {
		// TODO Auto-generated constructor stub
		for (int v = 1; v <= V; v++) {
			map.put(v, new HashMap<>());
		}
	}

	public void addEdge(int V1, int V2, int wt) {
		HashMap<Integer, Integer> Nbr_V1 = map.get(V1);
		Nbr_V1.put(V2, wt);
		HashMap<Integer, Integer> Nbr_V2 = map.get(V2);
		Nbr_V2.put(V1, wt);

	}

	public boolean containsEdge(int V1, int V2) {
		return map.get(V1).containsKey(V2);
	}

	public void removeEdge(int V1, int V2) {
		HashMap<Integer, Integer> Nbr_V1 = map.get(V1);
		Nbr_V1.remove(V2);
		HashMap<Integer, Integer> Nbr_V2 = map.get(V2);
		Nbr_V2.remove(V1);
	}

	public int numOfEdges() {
		int ans = 0;
		for (int V1 : map.keySet()) {
			for (int V2 : map.get(V1).keySet()) {
				ans++;
			}
		}
		return ans / 2;
	}

	public boolean hasPath(int curr, int Dest, HashSet<Integer> Visited) {
		if(curr==Dest) {
			return true;
		}
		
		if(Visited.contains(curr)) {
			return false;
		}
		Visited.add(curr);
		boolean ans = false;
		for (int nbr : map.get(curr).keySet()) {
			boolean sp = hasPath(nbr, Dest, Visited);
			ans = ans ||sp;
		}
		return ans;
	}
//	public void DFS(int curr, int Dest, HashSet<Integer> Visited) {
//		
//		Visited.add(curr);
//		for(int nbr : map.get(curr).keySet()) {
//			DFS(nbr, Dest, Visited);
//		}
//	}
}
