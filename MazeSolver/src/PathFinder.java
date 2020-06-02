import java.util.LinkedList;

public class PathFinder {
	int[][] maze;
	// entry point position (y,x) - throwing in the y value first
	Position pos;

	// keep track of the path we take - must create the stack as static to access
	// w.o instantiating a new object
	LinkedList<Position> path = new LinkedList<Position>();

	public PathFinder(int[][] maze, Position entryPosition) {
		this.maze = maze;
		this.pos = entryPosition;
	}

	void Search() {
		path.push(pos);

		while (true) {
			// first index refers to the row, which I labeled as y
			int y = path.peek().y;
			int x = path.peek().x;
			maze[y][x] = 0;
			// down
			if (Helper.IsValid(y + 1, x, maze)) {
				if (maze[y + 1][x] == 2) {
					System.out.println("Moved down \n You won!");
					return;
				} 
				else if (maze[y + 1][x] == 1) {
					System.out.println("Moved down");
					path.push(new Position(y + 1, x));
					continue;
				}
			}
			// left
			if (Helper.IsValid(y, x - 1, maze)) {
				if (maze[y][x - 1] == 2) {
					System.out.println("Moved left \n You won!");
					return;
				} 
				else if (maze[y][x - 1] == 1) {
					System.out.println("Moved left");
					path.push(new Position(y, x - 1));
					continue;
				}
			}
			// up
			if (Helper.IsValid(y - 1, x, maze)) {// up
				if (maze[y - 1][x] == 2) {
					System.out.println("Moved up \n You won!");
					return;
				} 
				else if (maze[y - 1][x] == 1) {
					System.out.println("Moved up");
					path.push(new Position(y - 1, x));
					continue;
				}
			}
			// right
			if (Helper.IsValid(y, x + 1, maze)) {
				if (maze[y][x + 1] == 2) {
					System.out.println("Moved right \n You won!");
					return;
				} 
				else if (maze[y][x + 1] == 1) {
					System.out.println("Moved right");
					path.push(new Position(y, x + 1));
					continue;
				}
			}

			path.pop();
			System.out.println("Moved back (backtracking)");
			if (path.size() <= 0) {
				System.out.println("No path !");
				return;
			}
		}
	}
}