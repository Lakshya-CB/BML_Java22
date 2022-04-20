package Lec_26;

import java.util.ArrayList;
import java.util.List;

public class Valid_Pareth {
	public static void main(String[] args) {
//		Genrate(4, 4, "");
//		Climb_Stairs(0, "", 4);
//		Maze_Path(0, 0, "", 2, 2);
		TOH(3, 'A', 'C', 'B');
	}

	public static List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<String>();
		Genrate(n, n, "", ans);
		return ans;
	}

	public static void Genrate(int open, int close, String path, List<String> ans) {
		if (open == 0 && open == close) { // +ve
//			System.out.println(path);
			ans.add(path);
			return;
		}
		if (open > close) {
//			u used more closing !! false combination!!
			// -ve !!
			return;
		}
		if (open > 0) {
			Genrate(open - 1, close, path + "(", ans);
		}
		if (close > 0) {

			Genrate(open, close - 1, path + ")", ans);
		}
	}

	public static void Climb_Stairs(int curr, String path, int dest) {
		if (dest == curr) {
			System.out.println(path); // +ve BC
			return;
		}
		if (curr > dest) {
			return; // -ve BC
		}

		Climb_Stairs(curr + 1, path + 1, dest);
		Climb_Stairs(curr + 2, path + 2, dest);

	}

	public static void Maze_Path(int r, int c, String path, int dest_r, int dest_c) {
		if (r == dest_r && c == dest_c) {
//			+ve BC
			System.out.println(path);
			return;
		}
		if (r == dest_r + 1 || c == dest_c + 1) {
			return;
		}
		Maze_Path(r, c + 1, path + "R",dest_r,dest_c);
		Maze_Path(r + 1, c, path + "D",dest_r,dest_c);

	}
	public static void TOH(int n, char src, char dest, char help) {
		if(n==0){
			return;
		}
//		move n-1 disk from src to helper!!  using dest!!
		TOH(n-1, src, help, dest);
//		move a disk
		System.out.println("Move disk "+n+ " from "+src+ " to "+dest );
//		move n-1 disks 
		TOH(n-1, help, dest, src);
	}
}
