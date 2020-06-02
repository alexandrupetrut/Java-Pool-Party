import java.util.LinkedList;

public class MazeSolver {

	// 0 = wall
	// 1 = path
	// 2 = destination
	static int[][] maze = {
			{2, 0, 1, 1},
			{1, 1, 0, 1},
			{0, 1, 1, 1}
	};
	
	// keep track of the path we take  -  must create the stack as static to access it w/o instantiation
	static LinkedList<Position> path = new LinkedList<Position>();
	
	// represent a position
	
	public static void main(String[] args) {
		// entry point
		Position p = new Position(3, 0);
		path.push(p);
		
		// first index refers to the row, which I labeled as y
		maze[path.peek().y][path.peek().x] = 0;
	}
}
