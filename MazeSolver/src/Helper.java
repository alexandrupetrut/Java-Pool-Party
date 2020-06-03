
public class Helper {
	// helpful to check the walls - boundaries
	public static boolean IsValid (int y, int x, Maze m)
	{
		if (y < 0 || y >= m.maze.length || x < 0 || x > m.maze[y].length)
		{
			return false;
		}
		return true;
	}
}
