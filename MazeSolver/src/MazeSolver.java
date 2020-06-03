import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MazeSolver {
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Maze> mazes = readMazes();
		readMazes();
		
		int i = 0;
		while (i < mazes.size()) {
			// instantiate the path finder - main logic for solving the maze
			var finder = new PathFinder(mazes.get(i));
			// save whether the run was successful or not
			boolean solvedMaze = finder.SolveMaze();
			if (!solvedMaze) {
				System.out.println("No path...");
				System.out.println();
			} 
			else {
				System.out.println("You won!");
				System.out.println();
			}
			i++;
		}
	}

	private static ArrayList<Maze> readMazes() throws FileNotFoundException {
		var mazes = new ArrayList<Maze>();
		Scanner scan = new Scanner(new File("src/mazes.txt"));
		while(scan.hasNextLine()) {
			int rows = Integer.parseInt(scan.nextLine());
			Maze m = new Maze();
			m.maze = new int[rows][];
			
			for(int i = 0; i < rows; i++)
			{
				String line = scan.nextLine();
				m.maze[i] = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();
			}
			
			m.start = new Position(Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine()));
			scan.nextLine();  // toss the extra space
			mazes.add(m);
		}
		scan.close();
		return mazes;
	}
}