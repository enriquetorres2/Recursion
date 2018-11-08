import java.util.ArrayList;

public class Maze {
	
	public static final int WIDTH = 5;
	public static final int HEIGHT = 5;
	
	public static int[][] maze = {
			{3,3,0,0,0},
			{0,3,3,3,0},
			{0,3,0,3,3},
			{0,3,0,0,3},
			{0,3,2,3,3}
	};

	public static void main(String[] args) {
		ArrayList<String> result = findCheese();
		for(int i = result.size()-1; i >= 0; i--) {
			String s = result.get(i);
			System.out.println(s);
		}
	}

	private static ArrayList<String> findCheese() {
		ArrayList<String> result = find(0,0);
		if(result != null) {
			return result;
		}
		result = new ArrayList<String>();
		result.add("Cheese 404");
		return result;
	}

	private static ArrayList<String> find(int x, int y) {
		if(x >=0 && y >= 0 && x < WIDTH && y < HEIGHT) {
			switch(maze[y][x]) {
			case 0:
			case 1: return null;
			case 2: 
				ArrayList<String> sol = new ArrayList<String>();
				sol.add("("+x+","+y+")");
				return sol;
			case 3:
				maze[y][x]=1;
				ArrayList<String> result1 = find(x,y-1);
				if(result1!=null) {
					result1.add("("+x+","+y+")");
					return result1;
				}
				ArrayList<String> result2 = find(x-1,y);
				if(result2!=null) {
					result2.add("("+x+","+y+")");
					return result2;
				}
				ArrayList<String> result3 = find(x,y+1);
				if(result3!=null) {
					result3.add("("+x+","+y+")");
					return result3;
				}
				ArrayList<String> result4 = find(x+1,y);
				if(result4!=null) {
					result4.add("("+x+","+y+")");
					return result4;
				}
			}
		}
		return null;
	}

}
