
public class MultiDimensional_Jagged_Array {
	public static void BrowsingMultidimensionalArrays()
	{
		int[][] data = { { 1, 2, 3, 4 }, { 5, 9, 15, 19, 22, 23 }, { 0, 0, 2, 16, 19 } };

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

	}
}