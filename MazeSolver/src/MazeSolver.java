import java.util.LinkedList;

public class MazeSolver {

	public static void main(String[] args) {
		
		// 0 = wall
		// 1 = path
		// 2 = destination
		int[][] maze = { 
				{ 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 }, 
				{ 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0 }, 
				{ 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1 }, 
				{ 1, 1, 1, 2, 0, 1, 0, 1, 0, 1, 0 }, 
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0 }, 
				{ 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1 }, 
		};
		
		// entry point position (y,x) - throwing in the y value first
		Position p = new Position(4, 8);
		
		var finder = new PathFinder(maze, p);
		finder.Search();
	}
	
}