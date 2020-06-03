import java.util.LinkedList;

public class PathFinder {
	Maze input;
	// entry point position (y,x) - throwing in the y value first
	Position pos;

	// keep track of the path we take - must create the stack as static to access
	// w.o instantiating a new object
	LinkedList<Position> path = new LinkedList<Position>();

	public PathFinder(Maze maze) {
		this.input = maze;
		this.pos = maze.start;
	}

	boolean SolveMaze() {
		path.push(pos);
		System.out.println("Starting from [x,y] as [" + pos.x + "," + pos.y + "].");
		while (true) {
			// first index refers to the row, which I labeled as y
			int y = path.peek().y;
			int x = path.peek().x;
			input.maze[y][x] = 0;
			// down
			if (Helper.IsValid(y + 1, x, input)) {
				if (input.maze[y + 1][x] == 2) {
					System.out.println("Moved down. ");
					return true;
				} 
				else if (input.maze[y + 1][x] == 1) {
					System.out.println("Moved down. ");
					path.push(new Position(y + 1, x));
					continue;
				}
			}
			// left
			if (Helper.IsValid(y, x - 1, input)) {
				if (input.maze[y][x - 1] == 2) {
					System.out.println("Moved left. ");
					return true;
				} 
				else if (input.maze[y][x - 1] == 1) {
					System.out.println("Moved left. ");
					path.push(new Position(y, x - 1));
					continue;
				}
			}
			// up
			if (Helper.IsValid(y - 1, x, input)) {// up
				if (input.maze[y - 1][x] == 2) {
					System.out.println("Moved up. ");
					return true;
				} 
				else if (input.maze[y - 1][x] == 1) {
					System.out.println("Moved up. ");
					path.push(new Position(y - 1, x));
					continue;
				}
			}
			// right
			if (Helper.IsValid(y, x + 1, input)) {
				if (input.maze[y][x + 1] == 2) {
					System.out.println("Moved right. ");
					return true;
				} 
				else if (input.maze[y][x + 1] == 1) {
					System.out.println("Moved right. ");
					path.push(new Position(y, x + 1));
					continue;
				}
			}

			path.pop();
			System.out.println("Moved back (backtracking). ");
			if (path.size() <= 0) {
				return false;
			}
		}
	}
}