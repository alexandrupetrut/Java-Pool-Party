
public class Helper {
	// helpful to check the walls - boundaries
	public static boolean IsValid (int y, int x, int[][] maze)
	{
		if (y < 0 || y >= maze.length || x < 0 || x > maze[y].length)
		{
			return false;
		}
		return true;
	}
}
