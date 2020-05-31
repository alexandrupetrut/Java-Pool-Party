import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingData {

	public static void ConsoleScanner() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size (number) !");
		int size = scan.nextInt();

		int[] grades = new int[size];
		System.out.println("Enter " + size + " numbers. Please enter after each");
		for (int i=0; i<size; i++)
		{
			grades[i] = scan.nextInt();
		}

		scan.close();

		for (int i=0; i<size; i++)
		{
			System.out.println(grades[i]);
		}
	}

	public static void FileScanner(String filePath) throws FileNotFoundException 
	{
		Scanner scan =  new Scanner(new File(filePath));
		
		List<String> names = new ArrayList<String>();
		
		while (scan.hasNextLine())
		{
			names.add(scan.nextLine());			
		}
		
		for (int i=0; i<names.size(); i++)
		{
			System.out.println("name: " + names.get(i));
		}
		
		scan.close();
	}

}
